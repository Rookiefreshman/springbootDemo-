package com.shixiang.demo.service.impl;

import com.shixiang.demo.entity.ApiRequestParam;
import com.shixiang.demo.entity.ApiResponseParam;
import com.shixiang.demo.dao.ApiResponseParamDao;
import com.shixiang.demo.service.ApiResponseParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ApiResponseParam)表服务实现类
 *
 * @author makejava
 * @since 2020-04-15 09:11:49
 */
@Service("apiResponseParamService")
public class ApiResponseParamServiceImpl implements ApiResponseParamService {
    @Resource
    private ApiResponseParamDao apiResponseParamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param responseParamId 主键
     * @return 实例对象
     */
    @Override
    public ApiResponseParam queryById(Long responseParamId) {
        return this.apiResponseParamDao.queryById(responseParamId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ApiResponseParam> queryAllByLimit(int offset, int limit) {
        return this.apiResponseParamDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param apiResponseParam 实例对象
     * @return 实例对象
     */
    @Override
    public ApiResponseParam insert(ApiResponseParam apiResponseParam) {
        this.apiResponseParamDao.insert(apiResponseParam);
        return apiResponseParam;
    }

    /**
     * 修改数据
     *
     * @param apiResponseParam 实例对象
     * @return 实例对象
     */
    @Override
    public ApiResponseParam update(ApiResponseParam apiResponseParam) {
        this.apiResponseParamDao.update(apiResponseParam);
        return this.queryById(apiResponseParam.getResponseParamId());
    }

    @Override
    public List<ApiResponseParam> findRequsetParamByApiId(Integer apiId) {
        return this.apiResponseParamDao.findRequsetParamByApiId(apiId);
    }

    /**
     * 通过主键删除数据
     *
     * @param responseParamId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long responseParamId) {
        return this.apiResponseParamDao.deleteById(responseParamId) > 0;
    }
}