package com.javabgy.aryaucenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.javabgy.aryaucenter.mapper")
public class AryaUcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AryaUcenterApplication.class, args);
    }

}
