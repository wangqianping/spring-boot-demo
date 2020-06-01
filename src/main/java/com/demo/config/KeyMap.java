package com.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * 为指定的key设置过期时间
 */
@ConfigurationProperties
@Component
public class KeyMap {

    private Map<String, Duration> initCaches = new HashMap<>();


    public Map<String, Duration> getInitCaches() {
        return initCaches;
    }

}
