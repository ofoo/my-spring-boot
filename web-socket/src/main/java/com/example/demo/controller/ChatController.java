package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guochao
 * @version 1.0
 * @date 2022/10/26 13:53
 */
@Controller
public class ChatController {

    /**
     * 聊天
     * @return
     */
    @RequestMapping("/chat")
    public String chat(){
        return "chat/chat-index";
    }
}
