package com.shixiang.demo.dao;


import com.shixiang.demo.entity.ApiService;
import com.shixiang.demo.entity.ApiTableInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApiServiceMapper {

  public  ApiService queryById(Integer apiId);


    /**
     * 根据表名查询用户信息（直接使用注解指定传入参数名称）
     * @param tableName
     * @return
     */
    public Integer queryUserByTableName(@Param("tableName") String tableName);
    /**
     * 根据Id查询用户信息
     * @param id
     * @return
     */
  /**

   * @param field
   * @param tableName
   * */
  List<ApiService> DynamicSelect(@Param("tableName")String tableName,@Param("field") String field);
}
