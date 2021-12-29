package com.example.demo.controller;

import com.example.demo.entity.Beauty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author guochao
 * @Date 2021/12/27 21:58
 * @Version 1.0
 */
@Controller
public class VueController {
    @RequestMapping("/beauty/list")
    public String list() {
        return "beauty/beauty-list";
    }

    @RequestMapping("/beauty/ajax/list")
    @ResponseBody
    public Object ajaxList() {
        List<Beauty> list = new ArrayList<>();
        list.add(new Beauty(1L, "高圆圆", "", 22, "女", new Date()));
        list.add(new Beauty(2L, "唐嫣", "", 22, "女", new Date()));
        list.add(new Beauty(3L, "林志玲", "", 22, "女", new Date()));
        return list;
    }

    //保存页面
    @RequestMapping("/beauty/save")
    public String save(Long id, Model model) {
        model.addAttribute("id", id);
        return "beauty/beauty-save";
    }

    //保存功能
    @RequestMapping("/beauty/ajax/save")
    @ResponseBody
    public Object ajaxSave(@RequestBody Beauty beauty) {
        System.out.println(beauty);
        return null;
    }

    //保存功能
    @RequestMapping("/beauty/ajax/getById")
    @ResponseBody
    public Object ajaxGetById(Long id) {
        return new Beauty(id, "高圆圆", "", 22, "女", new Date());
    }
}
