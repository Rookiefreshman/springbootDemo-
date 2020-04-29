package com.shixiang.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (ApiService)实体类
 *
 * @author makejava
 * @since 2020-04-15 08:47:13
 */
//@Api（注释）
@ApiModel("服务表实体类")
public class ApiService implements Serializable {
    private static final long serialVersionUID = 559424582939063730L;
    @ApiModelProperty("服务表api标识")
    private Integer apiId;
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


    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiNameEn() {
        return apiNameEn;
    }

    public void setApiNameEn(String apiNameEn) {
        this.apiNameEn = apiNameEn;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getProtocal() {
        return protocal;
    }

    public void setProtocal(String protocal) {
        this.protocal = protocal;
    }

    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public String getApiDesc() {
        return apiDesc;
    }

    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc;
    }

    public String getApiMode() {
        return apiMode;
    }

    public void setApiMode(String apiMode) {
        this.apiMode = apiMode;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getResponsePageFlag() {
        return responsePageFlag;
    }

    public void setResponsePageFlag(String responsePageFlag) {
        this.responsePageFlag = responsePageFlag;
    }

}