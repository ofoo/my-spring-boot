package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.redis.ObjectRedisTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@Slf4j
public class RedisTest {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private ObjectRedisTemplate objectRedisTemplate;

    /**
     * 对象存储实例
     */
    @Test
    public void testObject() {
        String key = "user:1";
        objectRedisTemplate.opsForValue().set(key, new User(1, "郭碧婷", 20));
        User user = (User) objectRedisTemplate.opsForValue().get(key);
        log.info("uesr: " + user);
    }

    /**
     * 字符串存储实例
     */
    @Test
    public void testString() {
        stringRedisTemplate.opsForValue().set("key", "唐嫣");
        String key = stringRedisTemplate.opsForValue().get("key");
        log.info(key);
    }

    /**
     * 测试时间存储实例
     */
    @Test
    public void testTime() {
        //存储20秒
        stringRedisTemplate.opsForValue().set("key", "鱼闪闪", 20, TimeUnit.SECONDS);
        String key = stringRedisTemplate.opsForValue().get("key");
        log.info(key);
    }

    /**
     * 测试时间存储实例2
     */
    @Test
    public void testTime2() {
        //存储20秒
        stringRedisTemplate.opsForValue().set("key", "鱼闪闪", Duration.ofSeconds(20));
        String key = stringRedisTemplate.opsForValue().get("key");
        log.info(key);
    }
}
