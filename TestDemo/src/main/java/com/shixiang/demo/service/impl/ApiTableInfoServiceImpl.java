package com.shixiang.demo.service.impl;

import com.shixiang.demo.entity.ApiTableInfo;
import com.shixiang.demo.dao.ApiTableInfoDao;
import com.shixiang.demo.service.ApiTableInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ApiTableInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-15 09:12:37
 */
@Service("apiTableInfoService")
public class ApiTableInfoServiceImpl implements ApiTableInfoService {
    @Resource
    private ApiTableInfoDao apiTableInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param apiTableId 主键
     * @return 实例对象
     */
    @Override
    public ApiTableInfo queryById(Integer apiTableId) {

        return this.apiTableInfoDao.queryById(apiTableId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ApiTableInfo> queryAllByLimit(int offset, int limit) {
        return this.apiTableInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param apiTableInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ApiTableInfo insert(ApiTableInfo apiTableInfo) {
        this.apiTableInfoDao.insert(apiTableInfo);
        return apiTableInfo;
    }

    /**
     * 修改数据
     *
     * @param apiTableInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ApiTableInfo update(ApiTableInfo apiTableInfo) {
        this.apiTableInfoDao.update(apiTableInfo);
        return this.queryById(apiTableInfo.getApiTableId());
    }

    /**
     * 通过主键删除数据
     *
     * @param apiTableId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long apiTableId) {
        return this.apiTableInfoDao.deleteById(apiTableId) > 0;
    }
}