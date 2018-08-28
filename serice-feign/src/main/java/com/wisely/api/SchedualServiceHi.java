package com.wisely.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 王路静 on 2018/8/28.
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi") //, method = RequestMethod.GET
    public String sayHiFromClientOne(@RequestParam(value = "name")String name);
}
