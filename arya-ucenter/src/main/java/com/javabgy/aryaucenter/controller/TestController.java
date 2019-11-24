package com.javabgy.aryaucenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gary
 * @className TestController
 * @description TODO
 * @date 2019/11/24 21:15
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello!";
    }
}
