package com.shixiang.demo.Interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;
@Configuration
public class AppConfig implements WebMvcConfigurer {

//    @Resource
//    private RequsetInterceptor interceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // 自定义拦截器，添加拦截路径和排除拦截路径
//        registry.addInterceptor(interceptor).addPathPatterns("/**");
//    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getRequsetInterceptor()).addPathPatterns("/**");
    }

    @Bean
    public HandlerInterceptor getRequsetInterceptor(){
        return new RequsetInterceptor();

    }
}
