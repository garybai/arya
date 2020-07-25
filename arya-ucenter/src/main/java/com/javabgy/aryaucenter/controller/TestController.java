package com.javabgy.aryaucenter.controller;

import com.javabgy.aryaucenter.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gary
 * @className TestController
 * @description TODO
 * @date 2019/11/24 21:15
 **/
@RestController
@RequestMapping("/ucenter")
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("test");
        return testService.test();
    }

    @GetMapping(value = "/fallback")
    public String fallback() {
        System.out.println("fallback");
        return testService.fallback();
    }

    @PostMapping(value = "/demo")
    public List<Integer> demo(@RequestParam(value = "num") Integer num) {
        System.out.println("demo");
        System.out.println(10 / num);
        List<Integer> list = new ArrayList<>();
        for (int i = num; i < num + 3; i++) {
            list.add(i);
        }
        return list;
    }
}
