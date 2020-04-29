package com.shixiang.demo.service;


import com.shixiang.demo.entity.ApiService;
import org.apache.ibatis.annotations.Param;

public interface CommonService {

    Integer testSelect(String tableName);
}