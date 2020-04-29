package com.shixiang.demo.Interceptor;


import com.shixiang.demo.entity.ApiResponse;
import com.shixiang.demo.enums.CodeEnum;
import com.shixiang.demo.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author luoyushan
 * @Date 2020/4/13 11:03
 *  用于拦截所有请求 根据请求ip解析
 */
public class RequsetInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!getClientIp(request).equals(getHostIp())) {
            String apiNameEn = null;
            try {
                apiNameEn = request.getRequestURI().split("/")[1];
            } catch (Exception e) {
                returnJson(response, ApiResponse.failure(CodeEnum.FAILED.getMsg()));
                return  false;
            }
            returnJson(response,consumerService.Find_request(request,apiNameEn,restTemplate));

            return false;
        }
        return true;
    }

    /**
     * 将数据返回给前端
     * @param response 响应对象
     * @param apiResponse 响应模板对象
     * @throws Exception 抛出的异常
     */
    private void returnJson(HttpServletResponse response, ApiResponse apiResponse) throws Exception{
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(apiResponse);

        } catch (IOException e) {
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    /**
     * 获取本机ip
     * @return 返回本机真实ip地址
     */
    private static String getHostIp() {
        String localhost = "";
        try {
            InetAddress localHost2 = InetAddress.getLocalHost();
            localhost = localHost2.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return localhost;
    }

    /**
     * 获取客户端的IP地址
     *
     * @return返回客户端ip地址
     */
    public String getClientIp(HttpServletRequest request) {
        String ipAddress = null;
        ipAddress = request.getHeader("x-forwarded-for");
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
                // 根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                if (inet != null) {
                    ipAddress = inet.getHostAddress();
                }
            }

        }

        // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ipAddress != null && ipAddress.length() > 15) {
            if (ipAddress.indexOf(",") > 0) {
                ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }
}
