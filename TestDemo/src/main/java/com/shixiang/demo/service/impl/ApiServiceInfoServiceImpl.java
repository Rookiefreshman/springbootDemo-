package com.shixiang.demo.service.impl;

import com.shixiang.demo.entity.ApiServiceInfo;
import com.shixiang.demo.dao.ApiServiceInfoDao;
import com.shixiang.demo.service.ApiServiceInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ApiServiceInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-15 09:11:59
 */
@Service("apiServiceInfoService")
public class ApiServiceInfoServiceImpl implements ApiServiceInfoService {
    @Resource
    private ApiServiceInfoDao apiServiceInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param apiServiceId 主键
     * @return 实例对象
     */
    @Override
    public ApiServiceInfo queryById(Long apiServiceId) {
        return this.apiServiceInfoDao.queryById(apiServiceId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ApiServiceInfo> queryAllByLimit(int offset, int limit) {
        return this.apiServiceInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param apiServiceInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ApiServiceInfo insert(ApiServiceInfo apiServiceInfo) {

        this.apiServiceInfoDao.insert(apiServiceInfo);
        return apiServiceInfo;
    }

    /**
     * 修改数据
     *
     * @param apiServiceInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ApiServiceInfo update(ApiServiceInfo apiServiceInfo) {
        this.apiServiceInfoDao.update(apiServiceInfo);
        return this.queryById(apiServiceInfo.getApiServiceId());
    }

    /**
     * 通过主键删除数据
     *
     * @param apiServiceId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long apiServiceId) {
        return this.apiServiceInfoDao.deleteById(apiServiceId) > 0;
    }

    @Override
    public ApiServiceInfo findInfoServiceByApiId(Integer apiId) {
        return this.apiServiceInfoDao.findInfoServiceByApiId(apiId);
    }
//    @Override
//    public ApiServiceInfo findInfoServiceByApiId(Long apiId) {
////        ApiServiceInfoExample apiServiceInfoExample = new ApiServiceInfoExample();
////        apiServiceInfoExample.or().andApiIdEqualTo(apiId);
//        ApiServiceInfo apiServiceIn =null;
////        for (ApiServiceInfo Service : apiServiceInfoMapper.selectByExample(apiServiceInfoExample)) {
////            apiServiceIn=Service;
////        }
//        return apiServiceIn ;
//    }


}