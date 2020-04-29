package com.shixiang.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.shixiang.demo.dao.ApiRequestParamDao;
import com.shixiang.demo.entity.*;
import com.shixiang.demo.enums.CodeEnum;
import com.shixiang.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
   private ApiServiceService  apiServiceService;
    @Autowired
    private ApiServiceInfoService apiServiceInfo;
    @Autowired
    private ApiRequestParamService apiRequestParamService;
    @Autowired
    private ApiResponseParamService apiResponseParamService;
    @Autowired
    private ApiTableInfoService apiTableInfoService;
    @Override
    public ApiResponse Find_request(HttpServletRequest request, String apiNameEn, RestTemplate restTemplate) {
//        ApiService service = apiServiceService.findServiceByApiNameEn(apiNameEn);
        //通过方法名字过滤得到Apiserver服务表中的信息 得到对应的api_id、requestmode
        ApiService service= apiServiceService.findServiceByApiNameEn(apiNameEn);
//         ApiService service=  apiServiceService.selectByTableNameAndPrimaryAttr("api_service","api_name_en,api_id",list);
        if (service == null) {
            return ApiResponse.failure("未找到对应的服务");
        }
        ApiServiceInfo serviceInfo = apiServiceInfo.findInfoServiceByApiId(service.getApiId());
        //获取注册服务表中的信息
        String requestMode = service.getRequestMode();
        String ApiMode=service.getApiMode();
        //获取get/post方式
//        String url = serviceInfo.getServiceHost()+ serviceInfo.getServicePath();
        //由于已经实现了zuul转发服务，故这里不需要
        List<ApiRequestParam> list=new ArrayList<ApiRequestParam>();

        //解析入参表得到的输入字段
        List<ApiRequestParam> requsetParamList1 = apiRequestParamService.findRequsetParamByApiId(service.getApiId());
        //解析出参表的输出字段
        List<ApiResponseParam> responseParamList = apiResponseParamService.findRequsetParamByApiId(service.getApiId());

        Map<String, String> data = new HashMap<>();
        for(int  i=0;  i<requsetParamList1.size();  i++)
        {
            String ColName=requsetParamList1.get(i).getColName();
            String value=requsetParamList1.get(i).getDemoValue();
            data.put(ColName,value);
        }
        Map<String, String> data1 = new HashMap<>();
        String ResponseColumn="";
        for(int  i=0;  i<responseParamList.size();  i++)
        {
            String ColName=responseParamList.get(i).getColName();
            String value=responseParamList.get(i).getDemoValue();
            ResponseColumn=ResponseColumn+ColName+",";
            data1.put(ColName,value);
        }
        if(ResponseColumn!="") {
            ResponseColumn = ResponseColumn.substring(0, ResponseColumn.length() - 1);
        }
        //由于功能比较简单 故就只有增删改查 根据api_name_en得到他是那条服务
        //对这个服务进行简单的解析，由于该模式我们服务列表已经配置上去了
        //故不考虑添加注册服务。即就只有默认的sql模式。
        //如果含有api_name_en需要进行
        //解析sql的入参和出参 通过api_id从api_table_info找
        //找出table_info表下的sql 传入入参和出参得到结果
        ApiTableInfo apiTableInfo=apiTableInfoService.queryById(service.getApiId());
        String TableName = apiTableInfo.getTableName();
        String Sql_Script= apiTableInfo.getSqlScript();
        //判断他是哪一种模式 select/update/delete/insert
        String mode=Sql_Script.substring(0,6);
        if(mode.toLowerCase().equals("select")) {
            List<Condition> list123 = new ArrayList<Condition>();
            for(int j=0;j<requsetParamList1.size();j++)
            {
                Condition aa1 = new Condition();
                aa1.setAttr(requsetParamList1.get(j).getColName());
                aa1.setValue(requsetParamList1.get(j).getDemoValue());
                list123.add(aa1);
            }
             List<AllClass> aa= apiServiceService.selectByTableNameAndPrimaryAttr(TableName, ResponseColumn, list123);
            return ApiResponse.success(aa);
        }
        else if(mode.toLowerCase().equals("update")){
            List<Condition> changeList = new ArrayList<Condition>();
            for(int j=0;j<responseParamList.size();j++)
            {
                Condition aa1 = new Condition();
                aa1.setAttr(responseParamList.get(j).getColName());
                aa1.setValue(responseParamList.get(j).getDemoValue());
                changeList.add(aa1);
            }

            List<Condition> Conditions = new ArrayList<Condition>();
            //responseParamList代表出参的集合
            //requsetParamList1代表入参的集合  select a from b where xxx;    a是出参（查询的列或者更新的列）  xxx是入参 代表条件
            for(int j=0;j<requsetParamList1.size();j++)
            {
                Condition aa1 = new Condition();
                aa1.setAttr(requsetParamList1.get(j).getColName());
                aa1.setValue(requsetParamList1.get(j).getDemoValue());
                Conditions.add(aa1);
            }
              apiServiceService.updateByTableName(TableName,changeList,Conditions);
            return ApiResponse.success("修改成功");
        }
        else if(mode.toLowerCase().equals("insert")){
            List<Condition> changeList = new ArrayList<Condition>();
            //DELETE AAA WHERE XXX.A=A
            //对于delete来说没有出参，全部为入参
            //出参我们设置为状态，即删除成功flag标志
            for(int j=0;j<requsetParamList1.size();j++)
            {
                Condition aa1 = new Condition();
                aa1.setValue(requsetParamList1.get(j).getDemoValue());//代表具体插入的值 入参表中获取
                aa1.setAttr(responseParamList.get(j).getColName());//代表插入的列 出参表中获取
                changeList.add(aa1);
            }
                apiServiceService.insertInfo(TableName,changeList);
                return ApiResponse.success("插入成功");
        }
            else if(mode.toLowerCase().equals("delete")){
            List<Condition> conditions = new ArrayList<Condition>();
            for(int j=0;j<requsetParamList1.size();j++)
            {
                Condition aa1 = new Condition();
                aa1.setValue(requsetParamList1.get(j).getDemoValue());
                aa1.setAttr(requsetParamList1.get(j).getColName());
                conditions.add(aa1);
            }
                   apiServiceService.deleteInfo(TableName,conditions);
                   return ApiResponse.success("删除成功");
            }
//        if (requsetParamList1.size()!=data.size()) {
//            return ApiResponse.failure(CodeEnum.PARAM.getMsg());
//        }
//        if (requestMode.equals("GET")) {
//            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
//            data.entrySet().stream().forEach(d ->builder.queryParam(d.getKey(), d.getValue()));
//            URI uri = builder.build().encode().toUri();
//            return restTemplate.getForObject(uri, ApiResponse.class);
//        }
//
//        if (requestMode.equals("POST")) {
//            HttpHeaders headers = new HttpHeaders();
//            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//            headers.setContentType(type);
//            HttpEntity<Object> objectHttpEntity = new HttpEntity<>(JSON.toJSONString(data),headers);
//            return restTemplate.postForObject(url, objectHttpEntity, ApiResponse.class);
//        }

        return ApiResponse.failure("不支持当前请求");
    }
}
