package com.eshop.eshopeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EshopEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopEurekaServiceApplication.class, args);
    }
}
