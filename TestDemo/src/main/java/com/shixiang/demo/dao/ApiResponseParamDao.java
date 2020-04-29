package com.shixiang.demo.dao;

import com.shixiang.demo.entity.ApiRequestParam;
import com.shixiang.demo.entity.ApiResponseParam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ApiResponseParam)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-15 09:11:49
 */
public interface ApiResponseParamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param responseParamId 主键
     * @return 实例对象
     */
    ApiResponseParam queryById(Long responseParamId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiResponseParam> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param apiResponseParam 实例对象
     * @return 对象列表
     */
    List<ApiResponseParam> queryAll(ApiResponseParam apiResponseParam);

    /**
     * 新增数据
     *
     * @param apiResponseParam 实例对象
     * @return 影响行数
     */
    int insert(ApiResponseParam apiResponseParam);

    /**
     * 修改数据
     *
     * @param apiResponseParam 实例对象
     * @return 影响行数
     */
    int update(ApiResponseParam apiResponseParam);

    /**
     * 通过主键删除数据
     *
     * @param responseParamId 主键
     * @return 影响行数
     */
    int deleteById(Long responseParamId);

    /**
     * 根据apiId查询 apiResponseParam对象
     * @param apiId
     * @return 查询到的 apiResponseParam对象
     */
    List<ApiResponseParam> findRequsetParamByApiId(Integer apiId);
}