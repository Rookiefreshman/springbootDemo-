package com.shixiang.demo.service;

import com.shixiang.demo.entity.ApiTableInfo;
import java.util.List;

/**
 * (ApiTableInfo)表服务接口
 *
 * @author makejava
 * @since 2020-04-15 09:12:37
 */
public interface ApiTableInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param apiTableId 主键
     * @return 实例对象
     */
    ApiTableInfo queryById(Integer apiTableId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiTableInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param apiTableInfo 实例对象
     * @return 实例对象
     */
    ApiTableInfo insert(ApiTableInfo apiTableInfo);

    /**
     * 修改数据
     *
     * @param apiTableInfo 实例对象
     * @return 实例对象
     */
    ApiTableInfo update(ApiTableInfo apiTableInfo);

    /**
     * 通过主键删除数据
     *
     * @param apiTableId 主键
     * @return 是否成功
     */
    boolean deleteById(Long apiTableId);

}