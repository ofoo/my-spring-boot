package com.example.demo.entity;

import com.example.demo.common.MyPage;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author guochao
 * @Date 2021/12/29 23:22
 * @Version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Beauty extends MyPage {
    private Long id;
    //姓名
    private String name;
    //照片
    private String photo;
    //年龄
    private Integer age;
    //性别
    private Integer gender;
    //生日
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date addTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date deleteTime;
    private Integer delStatus;
}
