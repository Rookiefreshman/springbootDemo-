package com.shixiang.demo.controller;

import com.shixiang.demo.annotation.MultiRequestBody;
import com.shixiang.demo.dao.ApiServiceDao;
import com.shixiang.demo.entity.AllClass;
import com.shixiang.demo.entity.ApiService;
import com.shixiang.demo.entity.Condition;
import com.shixiang.demo.service.ApiServiceService;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (ApiService)表控制层
 *
 * @author makejava
 * @since 2020-04-15 08:47:17
 */
@RestController
@RequestMapping("apiService")
public class ApiServiceController {
    /**
     * 服务对象
     */
    @Resource
    private ApiServiceService apiServiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("SelectOne/{id}")
    public ApiService selectOne(@PathVariable("id") Integer id) {
        return this.apiServiceService.queryById(id);
    }

    /**
     * 通过实体类插入数据
     *
     * @return 单条数据
     */
    @PostMapping("InsertOne")
    public ApiService InsertOne(@RequestBody ApiService apiService){
        return this.apiServiceService.insert(apiService);
    }

    /**
     * 通过实体类修改数据（通过id）
     *
     * @return 单条数据
     */
    @PutMapping("UpdateOne")
    public ApiService UpdateOne(@RequestBody ApiService apiService) {
        return this.apiServiceService.update(apiService);

    }

    @DeleteMapping("DeleteOne/{id}")
    public boolean DeleteOne(@PathVariable("id") Integer id){
        return this.apiServiceService.deleteById(id);
    }


    @GetMapping("ConditionalFilter")
    public String FilterParam(){

        return "hello";

    }
    @PostMapping("QueryPath")
    public List<ApiService> show(@RequestBody ApiService apiService){


// 将查询的条件信息封装为一个实体类
//        EmpCondition ec = new EmpCondition();
//        // 可以设置不确定的条件进行查询
//        ec.setKw("s");// 查询名字包括s
//        ec.setJob("clerk");// 查询职位为clerk
//        ec.setLosal(1000d);// 查询最低薪水为1000
//        ec.setHisal(5000d);// 查询最高薪水为5000
//        List<Emp> empList = empDAO.findEmpByConditionChanged(ec);

//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("api_id",21);
//        map.put("api_desc","1");
        return this.apiServiceService.queryAll(apiService);
//        return  this.apiServiceService.queryAll(apiService);
    }

    @PostMapping("aaa")
    public List<AllClass> aaa(@Param("tableName") String tableName, @Param("field") String field){
      return  this.apiServiceService.DynamicSelect(tableName,field);

    }
    @PostMapping("bbb")
    //所有表的查询功能，tablename代表表名，field代表列名，list代表过滤条件
    public List<AllClass> selectByTableNameAndPrimaryAttr
            (@Param("tableName") String tableName,
             @Param("field") String field,
             @RequestBody List<Condition> conditions)
    {
        List<Condition> list = new ArrayList<Condition>();
//        Condition aa = new Condition();
//        aa.setAttr("t.api_id");
//        aa.setValue("1");
//        list.add(aa);
//        Condition aa1 = new Condition();
//        aa1.setAttr("t1.api_id");
//        aa1.setValue("t.api_id");
//        for(int i = 0 ; i < conditions.size() ; i++) {
//            System.out.println(conditions.get(i));
//            conditions.get(i).getAttr();
//            conditions.get(i).getAttr();
//
//        }
//        list.add(aa1);
       return this.apiServiceService.selectByTableNameAndPrimaryAttr(tableName,field, conditions);

    }
    @RequestMapping(value = "UpdateAllType",method=RequestMethod.POST)
    //所有表的查询功能，tablename代表表名，field代表列名，list代表过滤条件
    public String updateByTableName
            (
            @Param("tableName") String tableName,
            @MultiRequestBody List changeList,
            @MultiRequestBody List conditions)
    {
        this.apiServiceService.updateByTableName(tableName,changeList,conditions);
        return "success" ;
    }
    @PostMapping("insertInfo")
    public String insertInfo
            (
                    @Param("tableName") String tableName,
                    @MultiRequestBody List changeList)
    {
        this.apiServiceService.insertInfo(tableName,changeList);
        return "success" ;
    }

    @PostMapping("deleteInfo")
    public String deleteInfo
            (
                    @Param("tableName") String tableName,
                    @MultiRequestBody List conditions)
    {
        this.apiServiceService.deleteInfo(tableName,conditions);
        return "success" ;
    }

}