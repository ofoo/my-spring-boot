package com.example.demo.controller;

import com.example.demo.common.Jr;
import com.example.demo.entity.Beauty;
import com.example.demo.service.BeautyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author guochao
 * @Date 2021/12/27 21:58
 * @Version 1.0
 */
@Controller
public class BeautyController {

    @Resource
    private BeautyService beautyService;

    @RequestMapping("/beauty/list")
    public String list() {
        return "beauty/beauty-list";
    }

    @RequestMapping("/beauty/ajax/list")
    @ResponseBody
    public Jr ajaxList() {
        List<Beauty> list = beautyService.list();
        return Jr.yesd(list);
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
    public Jr ajaxSave(@RequestBody Beauty beauty) {
        beautyService.save(beauty);
        return Jr.yesd(beauty.getId());
    }

    //删除功能
    @RequestMapping("/beauty/ajax/delete")
    @ResponseBody
    public Jr ajaxDelete(@RequestParam Long id) {
        beautyService.delete(id);
        return Jr.yes();
    }

    @RequestMapping("/beauty/ajax/getById")
    @ResponseBody
    public Jr ajaxGetById(Long id) {
        Beauty beauty = beautyService.getById(id);
        return Jr.yesd(beauty);
    }
}
