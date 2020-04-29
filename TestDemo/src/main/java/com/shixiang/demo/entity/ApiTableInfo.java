package com.shixiang.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * (ApiTableInfo)实体类
 *
 * @author makejava
 * @since 2020-04-15 09:12:37
 */

@ApiModel("SQL模式单表信息实体类")
public class ApiTableInfo implements Serializable {
    private static final long serialVersionUID = 211366022965028736L;

    @ApiModelProperty("SQL服务表信息")
    private Integer apiTableId;

    @ApiModelProperty("api标识")
    private Integer apiId;
    @ApiModelProperty("数据源类型")
    private String sourceType;
    @ApiModelProperty("数据源名称")
    private String sourceName;
    @ApiModelProperty("数据表名称")
    private String tableName;
    @ApiModelProperty("sql语句")
    private String sqlScript;


    public Integer getApiTableId() {
        return apiTableId;
    }

    public void setApiTableId(Integer apiTableId) {
        this.apiTableId = apiTableId;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }

}