package com.javabgy.aryagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AryaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AryaGatewayApplication.class, args);
    }

}
