package com.example.demo.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * @author  guochao
 * @date  2021/12/13 23:16
 * @version 1.0
 */
@Configuration
public class RedisConfig {
    @Bean
    public ObjectRedisTemplate objectRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        return new ObjectRedisTemplate(redisConnectionFactory);
    }
}