package com.example.demo.common;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @author guochao
 * @version 1.0
 * @date 2022/1/2 12:27
 */
public class MyUtils {
    //获取当前年份
    public static int getCurrentYear() {
        Date date = DateUtil.date();
        return DateUtil.year(date);
    }

    //获取指定日期年份
    public static Integer getYear(Date date) {
        if (date == null) {
            return null;
        }
        return DateUtil.year(date);
    }

    //获取年龄
    public static Integer getAge(Date date) {
        if (date == null) {
            return null;
        }
        int currentYear = getCurrentYear();
        int year = getYear(date);
        return currentYear - year;
    }
}
