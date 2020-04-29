package com.shixiang.demo.dao;

import com.shixiang.demo.entity.AllClass;
import com.shixiang.demo.entity.Condition;
import com.shixiang.demo.utils.MapperUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

//@Repository
//extends MapperUtil<AllClass>
//@Mapper
public interface TMapper  {
    Map<String,Object> selectByTableNameAndPrimaryAttr(@Param("tableName") String tableName, @Param("field") String field, @Param("conditions") List<Condition> conditions);

    List<Map<String,Object>> selectByTableNameAndCommonAttr(@Param("tableName") String tableName,@Param("conditions")List<Condition> conditions);

    void updateByTableName(@Param("tableName") String tableName,@Param("changeList")List<Condition> changeList,@Param("conditions")List<Condition> conditions);

}
