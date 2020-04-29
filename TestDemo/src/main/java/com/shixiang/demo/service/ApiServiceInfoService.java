package com.shixiang.demo.service;

import com.shixiang.demo.entity.ApiServiceInfo;
import java.util.List;

/**
 * (ApiServiceInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-15 09:11:59
 */
public interface ApiServiceInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param apiServiceId 主键
     * @return 实例对象
     */
    ApiServiceInfo queryById(Long apiServiceId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiServiceInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param apiServiceInfo 实例对象
     * @return 实例对象
     */
    ApiServiceInfo insert(ApiServiceInfo apiServiceInfo);

    /**
     * 修改数据
     *
     * @param apiServiceInfo 实例对象
     * @return 实例对象
     */
    ApiServiceInfo update(ApiServiceInfo apiServiceInfo);

    /**
     * 通过主键删除数据
     *
     * @param apiServiceId 主键
     * @return 是否成功
     */
    boolean deleteById(Long apiServiceId);


    /**
     * 根据apiId查询apiServiceInfo表
     * @param apiId
     * @return 返回查询到的 apiServiceInfo对象
     */
    ApiServiceInfo findInfoServiceByApiId(Integer apiId);
}