package com.shixiang.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (ApiResponseParam)实体类
 *
 * @author makejava
 * @since 2020-04-15 09:11:49
 */
@ApiModel("响应参数实体类")
public class ApiResponseParam implements Serializable {
    private static final long serialVersionUID = 126442926100487098L;

    @ApiModelProperty("响应参数标识")
    private Long responseParamId;
    @ApiModelProperty("api标识")
    private Long apiId;
    @ApiModelProperty("参数名称")
    private String paramName;
    @ApiModelProperty("绑定字段名")
    private String colName;
    @ApiModelProperty("参数类型")
    private String dataType;
    @ApiModelProperty("示例值")
    private String demoValue;
    @ApiModelProperty("参数描述")
    private String paramDesc;


    public Long getResponseParamId() {
        return responseParamId;
    }

    public void setResponseParamId(Long responseParamId) {
        this.responseParamId = responseParamId;
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

    public String getDemoValue() {
        return demoValue;
    }

    public void setDemoValue(String demoValue) {
        this.demoValue = demoValue;
    }

    public String getParamDesc() {
        return paramDesc;
    }

    public void setParamDesc(String paramDesc) {
        this.paramDesc = paramDesc;
    }

}