package com.shixiang.demo.service;

import com.shixiang.demo.entity.ApiRequestParam;
import com.shixiang.demo.entity.ApiResponseParam;
import java.util.List;

/**
 * (ApiResponseParam)表服务接口
 *
 * @author makejava
 * @since 2020-04-15 09:11:49
 */
public interface ApiResponseParamService {

    /**
     * 通过ID查询单条数据
     *
     * @param responseParamId 主键
     * @return 实例对象
     */
    ApiResponseParam queryById(Long responseParamId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiResponseParam> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param apiResponseParam 实例对象
     * @return 实例对象
     */
    ApiResponseParam insert(ApiResponseParam apiResponseParam);

    /**
     * 修改数据
     *
     * @param apiResponseParam 实例对象
     * @return 实例对象
     */
    ApiResponseParam update(ApiResponseParam apiResponseParam);

    /**
     * 通过主键删除数据
     *
     * @param responseParamId 主键
     * @return 是否成功
     */
    boolean deleteById(Long responseParamId);
    /**
     * 根据apiId查询 apiResponseParam对象
     * @param apiId
     * @return 查询到的 apiResponseParam对象
     */
    List<ApiResponseParam> findRequsetParamByApiId(Integer apiId);
}