package com.shixiang.demo.controller;

import com.shixiang.demo.entity.ApiResponseParam;
import com.shixiang.demo.service.ApiResponseParamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ApiResponseParam)表控制层
 *
 * @author makejava
 * @since 2020-04-15 09:11:49
 */
@RestController
@RequestMapping("apiResponseParam")
public class ApiResponseParamController {
    /**
     * 服务对象
     */
    @Resource
    private ApiResponseParamService apiResponseParamService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("SelectOne1/{id}")
    public ApiResponseParam selectOne(@PathVariable("id") Long id) {
        return this.apiResponseParamService.queryById(id);
    }

    /**
     * 通过实体类添加数据
     *
     * @return 单条数据
     */
    @PostMapping("InsertOne1")
    public ApiResponseParam InsertOne(ApiResponseParam apiResponseParam)
    {
        return this.apiResponseParamService.insert(apiResponseParam);
    }

    /**
     * 通过实体类中的id来修改数据
     *
     * @return 单条数据
     */
    @PutMapping("UpdateOne1")
    public  ApiResponseParam UpdateOne(ApiResponseParam apiResponseParam){
        return this.apiResponseParamService.update(apiResponseParam);
    }

    /**
     * 通过id来删除数据
     *
     * @return 单条数据
     */
    @DeleteMapping("DeleteOne1/{id}")
    public boolean DeleteOne(@PathVariable("id") Long id){
        return this.apiResponseParamService.deleteById(id);
    }


}