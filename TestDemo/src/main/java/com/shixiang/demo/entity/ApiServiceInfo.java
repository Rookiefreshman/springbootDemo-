package com.shixiang.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (ApiServiceInfo)实体类
 *
 * @author makejava
 * @since 2020-04-15 09:11:59
 */
@ApiModel("注册服务实体类")
public class ApiServiceInfo implements Serializable {
    private static final long serialVersionUID = -44485254405616690L;
    @ApiModelProperty("注册服务标识  bigint+1自增")
    private Long apiServiceId;
    @ApiModelProperty("api服务标识  bigint")
    private Long apiId;
    @ApiModelProperty("服务host 类型varchar(20) http://或https://")
    private String serviceHost;
    @ApiModelProperty("服务path     varchar(60) path中如果包含请求中的Paramater 放在[]中，如：/user/[userid]")
    private String servicePath;


    public Long getApiServiceId() {
        return apiServiceId;
    }

    public void setApiServiceId(Long apiServiceId) {
        this.apiServiceId = apiServiceId;
    }

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public String getServiceHost() {
        return serviceHost;
    }

    public void setServiceHost(String serviceHost) {
        this.serviceHost = serviceHost;
    }

    public String getServicePath() {
        return servicePath;
    }

    public void setServicePath(String servicePath) {
        this.servicePath = servicePath;
    }

}