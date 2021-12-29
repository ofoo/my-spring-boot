package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author guochao
 * @Date 2021/12/29 23:22
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beauty {
    private Long id;
    //姓名
    private String name;
    //照片
    private String photo;
    //年龄
    private Integer age;
    //性别
    private String gender;
    //生日
    private Date birthday;
}
