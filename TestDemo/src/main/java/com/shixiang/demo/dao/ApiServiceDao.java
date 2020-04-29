package com.shixiang.demo.dao;

import com.shixiang.demo.annotation.MultiRequestBody;
import com.shixiang.demo.entity.AllClass;
import com.shixiang.demo.entity.ApiService;
import com.shixiang.demo.entity.ApiServiceInfo;
import com.shixiang.demo.entity.Condition;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * (ApiService)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-15 08:47:14
 */
//dao层要加上mapper注解
    @Mapper
public interface ApiServiceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param apiId 主键
     * @return 实例对象
     */
    ApiService queryById(Integer apiId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ApiService> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param apiService 实例对象
//     * @param apiService 实例对象
     * @return 对象列表
     */
    //Map<String, Object> map
    List<ApiService> queryAll(ApiService apiService);
//    List<ApiService> queryAll(Map<String,Object> map) ;

    /**
     * 新增数据
     *
     * @param apiService 实例对象
     * @return 影响行数
     */
    int insert(ApiService apiService);

    /**
     * 修改数据
     *
     * @param apiService 实例对象
     * @return 影响行数
     */
    int update(ApiService apiService);

    /**
     * 通过主键删除数据
     *
     * @param apiId 主键
     * @return 影响行数
     */
    int deleteById(Integer apiId);



    /**

     * @param field
     * @param tableName
     * */
    List<AllClass> DynamicSelect(@Param("tableName")String tableName, @Param("field") String field);

    List<AllClass> selectByTableNameAndPrimaryAttr(@Param("tableName") String tableName, @Param("field") String field, @RequestBody List<Condition> conditions);

    void updateByTableName(@Param("tableName") String tableName,@RequestBody List<Condition> changeList,@RequestBody List<Condition> conditions);

    void insertInfo(@Param("tableName") String tableName, @RequestBody List<Condition> changeList);

    void deleteInfo(@Param("tableName") String tableName, @RequestBody List<Condition> conditions);

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
     * 根据apiId查询apiServiceInfo表
     * @param apiId
     * @return 返回查询到的 apiServiceInfo对象
     */
    ApiServiceInfo findInfoServiceByApiId(Integer apiId);
    /**
     * 添加应该apiServic对象
     * @param service apiService对象
     * @return 失败返回0 否则表示成功
     */
    int addApiService(ApiService service);
    }