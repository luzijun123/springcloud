package com.wisely;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 王路静 on 2018/8/28.
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {
    public static void main(String args[]) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String sayHi() {
        return foo;
    }
}
