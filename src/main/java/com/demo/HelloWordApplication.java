package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching          //开启缓存
@EnableAsync            //开启异步
@EnableScheduling       //开启定时
public class HelloWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWordApplication.class,args);
    }

}
