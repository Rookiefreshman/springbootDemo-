package com.shixiang.demo.dao;

import com.shixiang.demo.entity.ApiServiceInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ApiServiceInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-15 09:11:59
 */
public interface ApiServiceInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param apiServiceId 主键
     * @return 实例对象
     */
    ApiServiceInfo queryById(Long apiServiceId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiServiceInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param apiServiceInfo 实例对象
     * @return 对象列表
     */
    List<ApiServiceInfo> queryAll(ApiServiceInfo apiServiceInfo);

    /**
     * 新增数据
     *
     * @param apiServiceInfo 实例对象
     * @return 影响行数
     */
    int insert(ApiServiceInfo apiServiceInfo);

    /**
     * 修改数据
     *
     * @param apiServiceInfo 实例对象
     * @return 影响行数
     */
    int update(ApiServiceInfo apiServiceInfo);

    /**
     * 通过主键删除数据
     *
     * @param apiServiceId 主键
     * @return 影响行数
     */
    int deleteById(Long apiServiceId);

    /**
     * 根据apiId查询apiServiceInfo表
     * @param apiId
     * @return 返回查询到的 apiServiceInfo对象
     */
    ApiServiceInfo findInfoServiceByApiId(Integer apiId);
}