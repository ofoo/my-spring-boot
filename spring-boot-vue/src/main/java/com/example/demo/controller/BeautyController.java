package com.example.demo.controller;

import com.example.demo.common.Jr;
import com.example.demo.dto.BeautyDto;
import com.example.demo.entity.Beauty;
import com.example.demo.service.BeautyService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
    public Jr ajaxList(@RequestBody BeautyDto query) {
        PageInfo<BeautyDto> pageInfo = beautyService.list(query);
        return Jr.yesd(pageInfo);
    }

    //保存页面
    @RequestMapping("/beauty/save")
    public String save() {
        return "beauty/beauty-save";
    }

    //保存功能
    @RequestMapping("/beauty/ajax/save")
    @ResponseBody
    public Jr ajaxSave(@RequestBody Beauty beauty) {
        return beautyService.saveEnhance(beauty);
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
    public Jr ajaxGetById(@RequestParam Long id) {
        BeautyDto beauty = beautyService.getById(id);
        return Jr.yesd(beauty);
    }
}
