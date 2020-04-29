package com.shixiang.demo.service;

import com.shixiang.demo.entity.AllClass;
import com.shixiang.demo.entity.ApiService;
import com.shixiang.demo.entity.Condition;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * (ApiService)表服务接口
 *
 * @author makejava
 * @since 2020-04-15 08:47:16
 */
public interface ApiServiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param apiId 主键
     * @return 实例对象
     */
    ApiService queryById(Integer apiId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiService> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param apiService 实例对象
     * @return 实例对象
     */
    ApiService insert(ApiService apiService);

    /**
     * 修改数据
     *
     * @param apiService 实例对象
     * @return 实例对象
     */
    ApiService update(ApiService apiService);

    /**
     * 通过主键删除数据
     *
     * @param apiId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer apiId);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param apiService 实例对象
     * @return 对象列表
     */
    List<ApiService> queryAll(ApiService apiService);

    List<AllClass> DynamicSelect(String tableName, String field);

    List<AllClass> selectByTableNameAndPrimaryAttr(String tableName, String field,  List<Condition> conditions);

    void updateByTableName(  String tableName, List<Condition> changeList,  List<Condition> conditions);

    void insertInfo(  String tableName,   List<Condition> changeList);

    void deleteInfo(  String tableName,   List<Condition> conditions);

    /**
     * 查询apiservice所有
     * @return
     */
    List<ApiService> findAll();

    /**
     * 根据id查询
     * @param id 根据apiservice id 查询所有
     * @return 返回查询到的service对象
     */
    ApiService findServiceById(Long id);

    /**
     * 根据apiNameEn查询
     * @param apiNameEn
     * @return 返回查询到的service对象
     */
    ApiService findServiceByApiNameEn(String apiNameEn);

    /**
     * 添加应该apiServic对象
     * @param service apiService对象
     * @return 失败返回0 否则表示成功
     */
    int addApiService(ApiService service);
//    List<ApiService> queryAll(Map<String,Object> map) ;
}