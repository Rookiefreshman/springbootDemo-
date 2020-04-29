package com.shixiang.demo.controller;

import com.shixiang.demo.entity.ApiRequestParam;
import com.shixiang.demo.entity.ApiService;
import com.shixiang.demo.service.ApiRequestParamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ApiRequestParam)表控制层
 *
 * @author makejava
 * @since 2020-04-15 09:11:30
 */
@RestController
@RequestMapping("apiRequestParam")
public class ApiRequestParamController {
    /**
     * 服务对象
     */
    @Resource
    private ApiRequestParamService apiRequestParamService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("SelectOne2/{id}")
    public ApiRequestParam selectOne(@PathVariable("id") Long id) {
        return this.apiRequestParamService.queryById(id);
    }
    @PostMapping("InsertOne2")
    public ApiRequestParam insertOne(@RequestBody ApiRequestParam apiRequestParam){
        return this.apiRequestParamService.insert(apiRequestParam);
    }
    @PutMapping("UpdateOne2")
    public ApiRequestParam UpdateOne(@RequestBody ApiRequestParam apiRequestParam){
        return this.apiRequestParamService.update(apiRequestParam);
    }
    @DeleteMapping("DeleteOne2/{id}")
        public boolean DeleteOne(@PathVariable("id") Long id){
        return this.apiRequestParamService.deleteById(id);
        }

}