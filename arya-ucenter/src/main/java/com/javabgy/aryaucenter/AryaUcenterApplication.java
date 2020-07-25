package com.javabgy.aryaucenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.javabgy.aryaucenter.mapper")
@EnableCircuitBreaker
public class AryaUcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AryaUcenterApplication.class, args);
    }

}
