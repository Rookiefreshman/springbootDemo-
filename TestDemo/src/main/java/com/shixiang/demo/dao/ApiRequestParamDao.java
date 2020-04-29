package com.shixiang.demo.dao;

import com.shixiang.demo.entity.ApiRequestParam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ApiRequestParam)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-15 09:11:30
 */
public interface ApiRequestParamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param requestParamId 主键
     * @return 实例对象
     */
    ApiRequestParam queryById(Long requestParamId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiRequestParam> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param apiRequestParam 实例对象
     * @return 对象列表
     */
    List<ApiRequestParam> queryAll(ApiRequestParam apiRequestParam);

    /**
     * 新增数据
     *
     * @param apiRequestParam 实例对象
     * @return 影响行数
     */
    int insert(ApiRequestParam apiRequestParam);

    /**
     * 修改数据
     *
     * @param apiRequestParam 实例对象
     * @return 影响行数
     */
    int update(ApiRequestParam apiRequestParam);

    /**
     * 通过主键删除数据
     *
     * @param requestParamId 主键
     * @return 影响行数
     */
    int deleteById(Long requestParamId);

    /**
     * 根据apiId查询 apiRequsetParam对象
     * @param apiId
     * @return 查询到的 apiRequsetParam对象
     */
    List<ApiRequestParam> findRequsetParamByApiId(Integer apiId);
}