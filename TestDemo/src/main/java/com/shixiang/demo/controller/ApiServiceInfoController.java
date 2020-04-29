package com.shixiang.demo.controller;

import com.shixiang.demo.entity.ApiService;
import com.shixiang.demo.entity.ApiServiceInfo;
import com.shixiang.demo.service.ApiServiceInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ApiServiceInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-15 09:12:00
 */
@RestController
@RequestMapping("apiServiceInfo")
public class ApiServiceInfoController {
    /**
     * 服务对象
     */
    @Resource
    private ApiServiceInfoService apiServiceInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("SelectOne4/{id}")
    public ApiServiceInfo selectOne(@PathVariable("id") Long id) {

        return this.apiServiceInfoService.queryById(id);
    }

    @PostMapping("InsertOne4") //插入Apiserviceinfo表（根据传入的参数）
    public ApiServiceInfo insertOne(@RequestBody ApiServiceInfo apiServiceInfo){
        return this.apiServiceInfoService.insert(apiServiceInfo);
    }

    @PutMapping("UpdateOne4")
    public ApiServiceInfo updateOne(@RequestBody ApiServiceInfo apiServiceInfo){
        return this.apiServiceInfoService.update(apiServiceInfo);
    }

    @DeleteMapping("DeleteOne4/{id}")
    public boolean DeleteOne(@PathVariable("id") Long id){
        return this.apiServiceInfoService.deleteById(id);
    }
}