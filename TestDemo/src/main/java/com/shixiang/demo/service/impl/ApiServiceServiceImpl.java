package com.shixiang.demo.service.impl;

import com.shixiang.demo.dao.ApiTableInfoDao;
import com.shixiang.demo.entity.AllClass;
import com.shixiang.demo.entity.ApiService;
import com.shixiang.demo.dao.ApiServiceDao;
import com.shixiang.demo.entity.Condition;
import com.shixiang.demo.service.ApiServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (ApiService)表服务实现类
 *
 * @author makejava
 * @since 2020-04-15 08:47:17
 */
@Service("apiServiceService")
public class ApiServiceServiceImpl implements ApiServiceService {
    @Resource
    private ApiServiceService apiServiceService;
    @Resource
    private ApiServiceDao apiServiceDao;
//    @Override
//    public ApiService findServiceByApiNameEn(String apiNameEn) {
//        return null;
//    }
    @Override
    public ApiService findServiceByApiNameEn(String apiNameEn) {
            return this.apiServiceDao.findServiceByApiNameEn(apiNameEn);
    }

    @Override
    public List<ApiService> findAll() {
        return this.apiServiceDao.findAll();
    }

    @Override
    public ApiService findServiceById(Long id) {
        return this.findServiceById(id);
    }

    @Override
    public int addApiService(ApiService service) {
        return this.apiServiceDao.addApiService(service);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param apiId 主键
     * @return 实例对象
     */
    @Override
    public ApiService queryById(Integer apiId) {
        return this.apiServiceDao.queryById(apiId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ApiService> queryAllByLimit(int offset, int limit) {
        return this.apiServiceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param apiService 实例对象
     * @return 实例对象
     */
    @Override
    public ApiService insert(ApiService apiService) {
        this.apiServiceDao.insert(apiService);
        return apiService;
    }

    /**
     * 修改数据
     *
     * @param apiService 实例对象
     * @return 实例对象
     */
    @Override
    public ApiService update(ApiService apiService) {
        this.apiServiceDao.update(apiService);
        return this.queryById(apiService.getApiId());
    }


    /**
     * 通过实体作为筛选条件查询
     *
     * @param apiService 实例对象
     * @return 对象列表
     */
    @Override
    public List<ApiService> queryAll(ApiService apiService) {
        return  this.apiServiceDao.queryAll((apiService));
    }

    public List<AllClass> DynamicSelect(String tableName, String field) {
        return apiServiceDao.DynamicSelect( tableName,field);
    }

    public List<AllClass>  selectByTableNameAndPrimaryAttr(String tableName, String field, List<Condition> conditions) {
        return this.apiServiceDao.selectByTableNameAndPrimaryAttr(tableName, field, conditions);
    }

    @Override
    public void updateByTableName(String tableName, List<Condition> changeList, List<Condition> conditions) {
            this.apiServiceDao.updateByTableName(tableName, changeList, conditions);

    }

    @Override
    public void insertInfo(String tableName, List<Condition> changeList) {
         this.apiServiceDao.insertInfo(tableName,changeList);
    }

    @Override
    public void deleteInfo(String tableName, List<Condition> conditions) {
        this.apiServiceDao.deleteInfo(tableName, conditions);
    }

    /**
     * 通过主键删除数据
     *
     * @param apiId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer apiId) {
        return this.apiServiceDao.deleteById(apiId) > 0;
    }


}