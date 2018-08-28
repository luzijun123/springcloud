package com.wisely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 王路静 on 2018/8/28.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//@EnableFeignClients注解开启Feign的功能
@EnableFeignClients
public class ServiceFeignApplication {

    public static void main (String args[]) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
