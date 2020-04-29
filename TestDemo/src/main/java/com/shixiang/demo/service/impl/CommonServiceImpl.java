package com.shixiang.demo.service.impl;

import com.shixiang.demo.dao.ApiServiceMapper;
import com.shixiang.demo.dao.ApiTableInfoDao;
import com.shixiang.demo.entity.ApiTableInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommonServiceImpl {
    @Resource
    private ApiServiceMapper apiServiceMapper;

    //  public ApiTableInfo queryById(Long apiTableId) {
    //        return this.apiTableInfoDao.queryById(apiTableId);
    //    }
//    ApiTableInfo queryById(Long apiTableId);
//    public Integer testSelect(String tableName) {
////        return this.apiServiceMapper.testSelect(tableName);
//    }
}
