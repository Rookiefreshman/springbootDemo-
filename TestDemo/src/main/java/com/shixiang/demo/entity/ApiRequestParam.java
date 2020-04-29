package com.shixiang.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (ApiRequestParam)实体类
 *
 * @author makejava
 * @since 2020-04-15 09:11:30
 */
@ApiModel("请求表实体类")
public class ApiRequestParam implements Serializable {
    private static final long serialVersionUID = -30678709336928997L;

    @ApiModelProperty("请求参数标识 unsigned bigint")
    private Long requestParamId;
    @ApiModelProperty("api标识")
    private Long apiId;
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


    public Long getRequestParamId() {
        return requestParamId;
    }

    public void setRequestParamId(Long requestParamId) {
        this.requestParamId = requestParamId;
    }

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getDemoValue() {
        return demoValue;
    }

    public void setDemoValue(String demoValue) {
        this.demoValue = demoValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getParamPosition() {
        return paramPosition;
    }

    public void setParamPosition(String paramPosition) {
        this.paramPosition = paramPosition;
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

}