package com.shixiang.demo.controller;

import com.shixiang.demo.entity.ApiResponse;
import com.shixiang.demo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author sx
 * @Date 2020/4/21 21:28
 */
@RestController
@RequestMapping("/consumer/")
public class ConsumerController<T> {

    @Resource
    private ConsumerService consumerService;

   @Resource
   RestTemplate restTemplate;

    /**
     * 对外提供服务接口
     * 根据传解析的apiNameEn 调用对应表的接口
     */
    @RequestMapping("*")
    public ApiResponse serviceCallById(HttpServletRequest request, @PathVariable(name = "id", required = false) String msg) {
        String apiNameEn = request.getRequestURI().substring(9).split("/")[1];
        return this.consumerService.Find_request(request, apiNameEn,restTemplate);
    }



}
