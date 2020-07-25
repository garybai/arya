package com.javabgy.aryaapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Gary
 */
@FeignClient(name = "arya-ucenter", contextId = "ucenter", path = "/ucenter")
public interface ITestService {

    /**
     * @param :
     * @return java.lang.String
     * @description: 测试
     * @author: Gary
     * @date: 2019/11/29 17:23
     */
    @GetMapping("/test")
    String test();

    @GetMapping("/fallback")
    String fallback();

    /**
     * @param num:
     * @return java.util.List<java.lang.Integer>
     * @description: demo
     * @author: Gary
     * @date: 2019/11/29 17:24
     */
    @PostMapping("/demo")
    List<Integer> demo(@RequestParam(value = "num") Integer num);

}
