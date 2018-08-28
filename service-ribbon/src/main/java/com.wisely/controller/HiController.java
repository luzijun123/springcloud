package com.wisely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.service.HiService;

/**
 * Created by 王路静 on 2018/8/28.
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return hiService.hiService(name);
    }
}
