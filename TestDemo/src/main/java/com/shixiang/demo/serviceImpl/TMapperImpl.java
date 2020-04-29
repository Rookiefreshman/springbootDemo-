package com.shixiang.demo.serviceImpl;

import com.shixiang.demo.entity.Condition;
import com.shixiang.demo.dao.TMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class TMapperImpl implements TMapper {
    @Override
    public Map<String, Object> selectByTableNameAndPrimaryAttr(String tableName, String field, List<Condition> conditions) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectByTableNameAndCommonAttr(String tableName, List<Condition> conditions) {
        return null;
    }

    @Override
    public void updateByTableName(String tableName, List<Condition> changeList, List<Condition> conditions) {

    }
}
