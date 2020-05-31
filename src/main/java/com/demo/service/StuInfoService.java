package com.demo.service;

import com.demo.dao.StuInfoDao;
import com.demo.entity.StuInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuInfoService {

    @Resource
    private StuInfoDao stuInfoDao;

    public StuInfo getById(Long id) {
        if (id == null) {
            return null;
        }
        return stuInfoDao.getById(id);
    }

}
