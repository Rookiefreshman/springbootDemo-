package cn.sx.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启网关转发服务
public class ZuulStartMain {
    public static void main(String[] args) {

        SpringApplication.run(ZuulStartMain.class,args);



    }
}
