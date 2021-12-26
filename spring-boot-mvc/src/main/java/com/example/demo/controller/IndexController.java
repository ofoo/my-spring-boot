package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author guochao
 * @Date 2021/12/25 20:29
 * @Version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() throws IOException {
        return "index";
    }

    @GetMapping("/download")
    public StreamingResponseBody handle() {
        return new StreamingResponseBody() {
            @Override
            public void writeTo(OutputStream outputStream) throws IOException {
                // write...
                System.out.println(outputStream);
            }
        };
    }
}
