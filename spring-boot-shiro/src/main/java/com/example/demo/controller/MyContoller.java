package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyContoller {
    @RequestMapping({"/","/index"})
    public String toIndex(Model model){
        model.addAttribute("msg","hello,Shiro");
        return "index";
    }
}
