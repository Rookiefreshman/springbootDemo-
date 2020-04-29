package com.shixiang.demo.service;

import com.shixiang.demo.entity.ApiResponse;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

//
//package com.shixiang.demo.service;
//
//import com.shixiang.demo.entity.ApiServiceInfo;
//import java.util.List;
public interface ConsumerService {
    /**
     *  解析请求url调用相关服务 暂时只支持get和post请求
     * @param request
     * @param apiNameEn
     * @param restTemplate
     * @return 响应对象
     */
    ApiResponse Find_request(HttpServletRequest request, String apiNameEn, RestTemplate restTemplate);
}
