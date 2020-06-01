package com.demo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskTestController {

    @Autowired
    private SyncTask syncTask;
    @Autowired
    private ScheduleTask scheduleTask;

    @RequestMapping("/test")
    @GetMapping
    public String test() {
        syncTask.sayHello();
        return "successful";
    }


}
