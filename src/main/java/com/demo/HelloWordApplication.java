package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching          //开启缓存
public class HelloWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWordApplication.class,args);
    }

}
