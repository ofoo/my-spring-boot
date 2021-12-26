package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author guochao
 * @Date 2021/12/26 10:02
 * @Version 1.0
 */
@Data
public class MsgClient {
    private Date birthday;
    private String clientName;
    private String clientPhone;
    private String createBy;
    private String id;
    private String remark;
    private MsgClientGroup group;
}
