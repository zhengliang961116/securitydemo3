package com.zhsw.securitydemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SecurityDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDemo3Application.class, args);
    }

}
