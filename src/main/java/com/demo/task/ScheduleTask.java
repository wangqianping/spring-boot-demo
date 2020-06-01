package com.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 */
@Component
public class ScheduleTask {

    int i = 1;

    @Scheduled(fixedDelay = 1000)
    public void sayHello(){
        System.out.println("这是一个定时任务"+ i++ );
    }

}
