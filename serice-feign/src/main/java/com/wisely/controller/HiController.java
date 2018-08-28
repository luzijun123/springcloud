package com.wisely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.api.SchedualServiceHi;

/**
 * Created by 王路静 on 2018/8/28.
 */
@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hi")
    public String sayHi(String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
