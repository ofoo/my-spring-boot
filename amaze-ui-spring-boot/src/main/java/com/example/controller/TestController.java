package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guochao
 * @version 1.0
 * @date 2022/10/7 14:04
 */
@Controller
@Slf4j
public class TestController {

    @RequestMapping("/")
    public String adminLogin(){
        return "admin/admin-login";
    }

    @RequestMapping("/admin/list")
    public String adminList(){
        return "admin/admin-list";
    }

    @RequestMapping("/admin/save")
    public String adminSave(){
        return "admin/admin-save";
    }
}
