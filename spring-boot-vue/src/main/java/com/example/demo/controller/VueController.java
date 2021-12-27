package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author guochao
 * @Date 2021/12/27 21:58
 * @Version 1.0
 */
@Controller
public class VueController {
    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }
}
