package com.example.demo.redis;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.data.redis.connection.DefaultStringRedisConnection;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * @author  guochao
 * @date  2021/12/13 23:15
 * @version 1.0
 */
public class ObjectRedisTemplate extends RedisTemplate<String, Object> {

	public ObjectRedisTemplate() {
		setKeySerializer(RedisSerializer.string());
		setValueSerializer(new GenericFastJsonRedisSerializer());
		setHashKeySerializer(RedisSerializer.string());
		setHashValueSerializer(new GenericFastJsonRedisSerializer());
	}

	public ObjectRedisTemplate(RedisConnectionFactory connectionFactory) {
		this();
		setConnectionFactory(connectionFactory);
		afterPropertiesSet();
	}

	protected RedisConnection preProcessConnection(RedisConnection connection, boolean existingConnection) {
		return new DefaultStringRedisConnection(connection);
	}
}
