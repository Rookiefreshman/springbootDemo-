package com.shixiang.demo.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

public class Condition  {

    private String attr;
    private String opera;
    private Object value;//set get

    public Condition() {

    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public Object getValue() {
        return value;
    }

    public Condition(String attr, String opera, Object value) {
        this.attr = attr;
        this.opera = opera;
        this.value = value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
