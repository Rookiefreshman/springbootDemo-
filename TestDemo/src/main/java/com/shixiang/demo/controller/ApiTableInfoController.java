package com.shixiang.demo.controller;

import com.shixiang.demo.entity.ApiTableInfo;
import com.shixiang.demo.service.ApiTableInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ApiTableInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-15 09:12:37
 */
@RestController
@RequestMapping("apiTableInfo")
public class ApiTableInfoController {
    /**
     * 服务对象
     */
    @Resource
    private ApiTableInfoService apiTableInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne3/{id}")
    public ApiTableInfo selectOne(@PathVariable("id") Integer id) {
        return this.apiTableInfoService.queryById(id);
    }

    @PostMapping("InsertOne3")
    public ApiTableInfo InsertOne(@RequestBody ApiTableInfo apiTableInfo){
        return  this.apiTableInfoService.insert(apiTableInfo);
    }
    @PutMapping("UpdateOne3")
    public ApiTableInfo UpdateOne(@RequestBody ApiTableInfo apiTableInfo) {
        return this.apiTableInfoService.update(apiTableInfo);
    }
    @DeleteMapping("DeleteOne3/{id}")
    public boolean DeleteOne(@PathVariable("id") Long id){
        return this.apiTableInfoService.deleteById(id);
    }

}