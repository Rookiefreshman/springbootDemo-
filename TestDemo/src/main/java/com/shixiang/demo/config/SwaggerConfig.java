package com.shixiang.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2     //开启waagger2
public class SwaggerConfig {
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("a");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("b");
    }

    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("c");
    }

    //配置了Swagger的Docket的bena实例
    @Bean //实例化
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(ApiInfo.DEFAULT);
        .apiInfo(apiInfo())
        .groupName("shixiang")
        .select()
        //RequestHandlerSelectors配置要扫描接口的方式
        //basePackage：指定要扫描的包
        //any()扫描全部
        //none()不扫描
        // withClassAnnotation:扫描类上的注解，参数是一个注解的反射对象
        // withMethodAnnotation:扫描方法上的注解
        .apis(RequestHandlerSelectors.basePackage("com.shixiang.demo.controller"))
        //paths()。过滤什么路径
//        .paths(PathSelectors.ant("/shixian/"))
        .build();
    }

    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo(){

        Contact DEFAULT_CONTACT = new Contact("", "", "");
        return new ApiInfo(
            //作者信息
             "shixiang的SwaggerApi文档",
             "Api Documentation",
             "v1.0",
             "urn:tos",
             DEFAULT_CONTACT,
             "Apache 2.0",
             "http://www.apache.org/licenses/LICENSE-2.0",
             new ArrayList()
        );
    }
}
