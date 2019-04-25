package com.yanhao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaService1 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService1.class,args);
    }
}
