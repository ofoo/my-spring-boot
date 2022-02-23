package top.fengyulou.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author guochao
 * @Date 2022/2/24 0:36
 * @Version 1.0
 */
public class JDBCDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("USE chapter03;");
        list.add("CREATE TABLE users(" +
                "  id INT PRIMARY KEY AUTO_INCREMENT," +
                "  name VARCHAR(40)," +
                "  password VARCHAR(40)," +
                "  email VARCHAR(60)," +
                "  birthday DATE" +
                ")CHARACTER SET utf8 COLLATE utf8_general_ci;");
        JDBCUtils.executeDDL(list);
    }

    //创建数据库
    public static void test1(){
        String sql = "CREATE DATABASE chapter04;";
        JDBCUtils.executeDDL(sql);
    }
}
