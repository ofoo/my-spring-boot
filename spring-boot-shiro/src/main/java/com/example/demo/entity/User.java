package com.example.demo.entity;

import lombok.Data;

/**
 * @Author guochao
 * @Date 2021/12/17 22:17
 * @Version 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private String pwd;
    private String perms;
}
