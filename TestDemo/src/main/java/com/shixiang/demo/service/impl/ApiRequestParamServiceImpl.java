package com.shixiang.demo.service.impl;

import com.shixiang.demo.entity.ApiRequestParam;
import com.shixiang.demo.dao.ApiRequestParamDao;
import com.shixiang.demo.service.ApiRequestParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ApiRequestParam)表服务实现类
 *
 * @author makejava
 * @since 2020-04-15 09:11:30
 */
@Service("apiRequestParamService")
public class ApiRequestParamServiceImpl implements ApiRequestParamService {
    @Resource
    private ApiRequestParamDao apiRequestParamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param requestParamId 主键
     * @return 实例对象
     */
    @Override
    public ApiRequestParam queryById(Long requestParamId) {
        return this.apiRequestParamDao.queryById(requestParamId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ApiRequestParam> queryAllByLimit(int offset, int limit) {
        return this.apiRequestParamDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param apiRequestParam 实例对象
     * @return 实例对象
     */
    @Override
    public ApiRequestParam insert(ApiRequestParam apiRequestParam) {
        this.apiRequestParamDao.insert(apiRequestParam);
        return apiRequestParam;
    }

    /**
     * 修改数据
     *
     * @param apiRequestParam 实例对象
     * @return 实例对象
     */
    @Override
    public ApiRequestParam update(ApiRequestParam apiRequestParam) {
        this.apiRequestParamDao.update(apiRequestParam);
        return this.queryById(apiRequestParam.getRequestParamId());
    }

    @Override
    public List<ApiRequestParam> findRequsetParamByApiId(Integer apiId) {
        return this.apiRequestParamDao.findRequsetParamByApiId(apiId);
    }

    /**
     * 通过主键删除数据
     *
     * @param requestParamId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long requestParamId) {
        return this.apiRequestParamDao.deleteById(requestParamId) > 0;
    }
}