package com.example.demo.controller;

import cn.afterturn.easypoi.entity.vo.NormalExcelConstants;
import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.example.demo.entity.MsgClient;
import com.example.demo.entity.MsgClientGroup;
import com.example.demo.entity.StudentEntity;
import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
    public String index() throws IOException {
        List<StudentEntity> list = new ArrayList<>();
        list.add(new StudentEntity("1","唐嫣",2,new Date(),new Date()));
        list.add(new StudentEntity("2","郭碧婷",2,new Date(),new Date()));
        list.add(new StudentEntity("3","高圆圆",2,new Date(),new Date()));
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("计算机一班学生","学生"),
                StudentEntity.class, list);
        FileOutputStream fos = new FileOutputStream("G:\\github\\my-spring-boot\\spring-boot-easypoi\\"+System.currentTimeMillis()+".xls");
        workbook.write(fos);
        fos.close();
        workbook.close();
        return "index";
    }

    @RequestMapping("/dc")
    public String download(ModelMap map) {
        List<MsgClient> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            MsgClient client = new MsgClient();
            client.setBirthday(new Date());
            client.setClientName("小明" + i);
            client.setClientPhone("18797" + i);
            client.setCreateBy("JueYue");
            client.setId("1" + i);
            client.setRemark("测试" + i);
            MsgClientGroup group = new MsgClientGroup();
            group.setGroupName("测试" + i);
            client.setGroup(group);
            list.add(client);
        }
        ExportParams params = new ExportParams("2412312", "测试", ExcelType.XSSF);
        params.setFreezeCol(2);
        map.put(NormalExcelConstants.DATA_LIST, list); // 数据集合
        map.put(NormalExcelConstants.CLASS, MsgClient.class);//导出实体
        map.put(NormalExcelConstants.PARAMS, params);//参数
        map.put(NormalExcelConstants.FILE_NAME, params);//文件名称
        return NormalExcelConstants.EASYPOI_EXCEL_VIEW;//View名称
    }
}
