package com.wisely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 王路静 on 2018/8/28.
 */
@SpringBootApplication
//类加上注解@EnableZuulProxy，开启zuul的功能
@EnableZuulProxy
@EnableEurekaClient
public class ServiceZuulApplication {

    public static void main(String args[]){
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}
