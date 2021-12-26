package com.example.demo.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.example.demo.entity.StudentEntity;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author guochao
 * @Date 2021/12/25 20:29
 * @Version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        List<StudentEntity> list = new ArrayList<>();
        list.add(new StudentEntity("1","唐嫣",2,new Date(),new Date()));
        list.add(new StudentEntity("2","郭碧婷",2,new Date(),new Date()));
        list.add(new StudentEntity("3","高圆圆",2,new Date(),new Date()));
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("计算机一班学生","学生"),
                StudentEntity.class, list);
        return "index";
    }
}
