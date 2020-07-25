package com.javabgy.aryaapi.controller;

import com.javabgy.aryaapi.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author Gary
 * @date 2019/11/29 17:26
 * @since jdk1.8
 **/
@RestController
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping(value = "/test")
    public String test() {
        return testService.test();
    }

    @GetMapping(value = "/fallback")
    public String fallback() {
        System.out.println("bbb");
        System.out.println("aaa");
        System.out.println("ccc");
        return testService.fallback();
    }

//    @PostMapping(value = "/demo")
//    public List<Integer> demo(@RequestParam(value = "num") Integer num) {
//        return Try.ofSupplier(CircuitBreaker.decorateSupplier(circuitBreaker,
//                () -> testService.demo(num)))
//                .recover(CircuitBreakerOpenException.class, Collections.emptyList())
//                .get();
//        return testService.demo(num);
//    }
}
