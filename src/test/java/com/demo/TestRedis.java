package com.demo;

import com.demo.entity.StuInfo;
import com.demo.service.StuInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StuInfoService stuInfoService;

    @Test
    public void test1(){
        stringRedisTemplate.opsForValue().append("k1", "v1");
        stringRedisTemplate.opsForValue().append("k1", "world");
        System.out.println(stringRedisTemplate.opsForValue().get("k1"));
    }

    @Test
    public void test2(){
        StuInfo stuInfo = stuInfoService.getById(2l);
        redisTemplate.opsForValue().set("stuInfo-1",stuInfo);
    }

}
