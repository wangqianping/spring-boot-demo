package com.demo.controller;

import com.demo.entity.Major;
import com.demo.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/major")
public class MajorController {

    @Autowired
    private MajorService majorService;


    @RequestMapping("/get/{id}")
    public Major get(@PathVariable("id") long id){
        return majorService.getById(id);
    }

}
