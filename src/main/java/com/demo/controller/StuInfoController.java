package com.demo.controller;

import com.demo.entity.StuInfo;
import com.demo.service.StuInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/get/{id}")
    public StuInfo getStuInfo(@PathVariable("id") long id) {
        return stuInfoService.getById(id);
    }

    @ResponseBody
    @GetMapping("/update")
    public StuInfo updateStuInfo(StuInfo stuInfo) {
        StuInfo info = stuInfoService.update(stuInfo);
        return info;
    }

    @ResponseBody
    @GetMapping("/delete/{id}")
    public String deleteStuInfo(@PathVariable("id") long id) {
        stuInfoService.delete(id);
        return "sucess";
    }

}
