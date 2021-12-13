package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author guochao
 * @Date 2021/12/14 0:12
 * @Version 1.0
 */
@Controller
public class ShiroController {
    @RequestMapping({"/","/index"})
    public String demo(Model model){
        model.addAttribute("msg","你好啊，我的第一个Springboot-sgiro 程序！！");
        return "index";
    }
    //跳转到添加
    @RequestMapping("/user/add")
    public String add(){
        return "/user/add";
    }
    //跳转到更新
    @RequestMapping("/user/update")
    public String update(){
        return "/user/update";
    }
}
