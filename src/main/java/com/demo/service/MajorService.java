package com.demo.service;

import com.demo.dao.MajorMapper;
import com.demo.entity.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"major"})
public class MajorService {

    @Autowired
    private MajorMapper majorMapper;


    @Cacheable
    public Major getById(long id){
        return majorMapper.getById(id);
    }


}
