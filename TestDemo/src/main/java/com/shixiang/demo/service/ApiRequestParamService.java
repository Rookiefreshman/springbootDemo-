package com.shixiang.demo.service;

import com.shixiang.demo.entity.ApiRequestParam;
import java.util.List;

/**
 * (ApiRequestParam)表服务接口
 *
 * @author makejava
 * @since 2020-04-15 09:11:30
 */
public interface ApiRequestParamService {

    /**
     * 通过ID查询单条数据
     *
     * @param requestParamId 主键
     * @return 实例对象
     */
    ApiRequestParam queryById(Long requestParamId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiRequestParam> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param apiRequestParam 实例对象
     * @return 实例对象
     */
    ApiRequestParam insert(ApiRequestParam apiRequestParam);

    /**
     * 修改数据
     *
     * @param apiRequestParam 实例对象
     * @return 实例对象
     */
    ApiRequestParam update(ApiRequestParam apiRequestParam);

    /**
     * 通过主键删除数据
     *
     * @param requestParamId 主键
     * @return 是否成功
     */
    boolean deleteById(Long requestParamId);


    /**
     * 根据apiId查询 apiRequsetParam对象
     * @param apiId
     * @return 查询到的 apiRequsetParam对象
     */
    List<ApiRequestParam> findRequsetParamByApiId(Integer apiId);

}