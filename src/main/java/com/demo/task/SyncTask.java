package com.demo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 异步任务
 */
@Component
public class SyncTask {

    @Async
    public void sayHello()  {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello,这是一个异步任务");
    }


}
