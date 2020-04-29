package com.shixiang.demo.dao;

import com.shixiang.demo.entity.ApiTableInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ApiTableInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-15 09:12:37
 */
public interface ApiTableInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param apiTableId 主键
     * @return 实例对象
     */
    ApiTableInfo queryById(Integer apiTableId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiTableInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param apiTableInfo 实例对象
     * @return 对象列表
     */
    List<ApiTableInfo> queryAll(ApiTableInfo apiTableInfo);

    /**
     * 新增数据
     *
     * @param apiTableInfo 实例对象
     * @return 影响行数
     */
    int insert(ApiTableInfo apiTableInfo);

    /**
     * 修改数据
     *
     * @param apiTableInfo 实例对象
     * @return 影响行数
     */
    int update(ApiTableInfo apiTableInfo);

    /**
     * 通过主键删除数据
     *
     * @param apiTableId 主键
     * @return 影响行数
     */
    int deleteById(Long apiTableId);

}