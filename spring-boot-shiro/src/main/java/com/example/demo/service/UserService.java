package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author guochao
 * @Date 2021/12/17 22:21
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User queryUserByName(String name){
        return userDao.queryUserByName(name);
    }
}
