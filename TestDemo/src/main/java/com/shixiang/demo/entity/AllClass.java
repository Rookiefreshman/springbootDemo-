package com.shixiang.demo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
public class AllClass implements Serializable {
    @ApiModelProperty("请求参数标识 unsigned bigint")
    private Integer requestParamId;
    @ApiModelProperty("api标识")
    private Integer apiId;
    @ApiModelProperty("参数名称")
    private String paramName;
    @ApiModelProperty("绑定字段名")
    private String colName;
    @ApiModelProperty("参数类型String,Int,Long,Float,Double,Boolean,Json")
    private String dataType;
    @ApiModelProperty("操作符 等于=、大于>、小于<、。。。")
    private String operator;
    @ApiModelProperty("是否必填  是/否(T/F)")
    private String required;
    @ApiModelProperty("示例值")
    private String demoValue;
    @ApiModelProperty("默认值")
    private String defaultValue;
    @ApiModelProperty("参数位置")
    private String paramPosition;
    @ApiModelProperty("参数描述")
    private String paramDesc;

    @ApiModelProperty("响应参数标识")
    private Long responseParamId;
//    @ApiModelProperty("api标识")
//    private Long apiId;
//    @ApiModelProperty("参数名称")
//    private String paramName;
//    @ApiModelProperty("绑定字段名")
//    private String colName;
//    @ApiModelProperty("参数类型")
//    private String dataType;
//    @ApiModelProperty("示例值")
//    private String demoValue;
//    @ApiModelProperty("参数描述")
//    private String paramDesc;
//
//    @ApiModelProperty("服务表api标识")
//    private Integer apiId;
    @ApiModelProperty("api名称")
    private String apiName;
    @ApiModelProperty("服务表服务编码")
    private String apiNameEn;
    @ApiModelProperty("api路径")
    private String apiPath;
    @ApiModelProperty("协议/http|https")
    private String protocal;

    @ApiModelProperty("请求方式/  GET/POST")
    private String requestMode;

    @ApiModelProperty("api描述")
    private String apiDesc;
    @ApiModelProperty("api模式 （M01:注册模式；M02:SQL模式;）")
    private String apiMode;
    @ApiModelProperty("超时时间 默认10000ms")
    private Integer timeout;
    @ApiModelProperty("返回结果类型/JSPON")
    private String responseType;
    @ApiModelProperty("返回结果分页标志")
    private String responsePageFlag;

    @ApiModelProperty("注册服务标识  bigint+1自增")
    private Long apiServiceId;
//    @ApiModelProperty("api服务标识  bigint")
//    private Long apiId;
    @ApiModelProperty("服务host 类型varchar(20) http://或https://")
    private String serviceHost;
    @ApiModelProperty("服务path     varchar(60) path中如果包含请求中的Paramater 放在[]中，如：/user/[userid]")
    private String servicePath;


    @ApiModelProperty("SQL服务表信息")
    private Long apiTableId;

//    @ApiModelProperty("api标识")
//    private Long apiId;
    @ApiModelProperty("数据源类型")
    private String sourceType;
    @ApiModelProperty("数据源名称")
    private String sourceName;
    @ApiModelProperty("数据表名称")
    private String tableName;
    @ApiModelProperty("sql语句")
    private String sqlScript;
}
