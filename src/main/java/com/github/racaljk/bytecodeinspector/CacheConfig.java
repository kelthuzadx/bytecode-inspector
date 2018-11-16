package com.github.racaljk.bytecodeinspector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {
    private static Logger log = LoggerFactory.getLogger(CacheConfig.class);
    @Bean
    public CacheManager cacheManager(){
        log.warn("cache works");
        return new ConcurrentMapCacheManager();
    }
}
