package com.javabgy.aryaucenter.service.impl;

import com.javabgy.aryaucenter.service.ITestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 测试service实现
 *
 * @author Gary
 * @date 2020/3/23 16:50
 * @since jdk1.8
 **/
@Service
public class TestServiceImpl implements ITestService {
    @Override
    public String test() {
        return "hello test";
    }

    @HystrixCommand(fallbackMethod = "testFallbackHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
    })
    @Override
    public String fallback() {
//        int i = 10/0;
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello fallback";
    }

    public String testFallbackHandler() {
        return "hello fallback handler";
    }
}
