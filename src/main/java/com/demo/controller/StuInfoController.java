package com.demo.controller;

import com.demo.entity.StuInfo;
import com.demo.service.StuInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/stuInfo")
public class StuInfoController {

    @Resource
    private StuInfoService stuInfoService;

    @ResponseBody
    @RequestMapping("/get/{id}")
    public StuInfo getStuInfo(@PathVariable("id") long id){
        return stuInfoService.getById(id);
    }


}
