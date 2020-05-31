package com.demo.service;

import com.demo.dao.StuInfoDao;
import com.demo.entity.StuInfo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@CacheConfig        //可以配置缓存的一些公共信息，比如cacheName
public class StuInfoService {

    @Resource
    private StuInfoDao stuInfoDao;

    //必须要指定参数
    //cacheNames/value  指定缓存组件的名字，是一个数组，可以指定多个缓存
    //默认将结果存进缓存，key为传入的参数，value为返回值
    @Cacheable(cacheNames = {"stuInfo"})
    public StuInfo getById(Long id) {
        if (id == null) {
            return null;
        }
        return stuInfoDao.getById(id);
    }

    //将更新后的结果存进缓存，如果不指定key，默认为参数名
    @CachePut(cacheNames = {"stuInfo"}, key = "#stuInfo.id")
    public StuInfo update(StuInfo stuInfo) {
        stuInfoDao.update(stuInfo);
        return stuInfo;
    }

    /**
     * 删除一条数据后顺便将缓存清空
     * @param id
     */
    @CacheEvict(cacheNames = {"stuInfo"})
    public void delete(long id) {
//        stuInfoDao.delete(id);
        System.out.println("数据已经删除");
    }

}
