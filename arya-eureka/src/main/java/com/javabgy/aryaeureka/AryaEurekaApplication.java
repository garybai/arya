package com.javabgy.aryaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AryaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AryaEurekaApplication.class, args);
    }

}
