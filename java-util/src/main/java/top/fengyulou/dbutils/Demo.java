package top.fengyulou.dbutils;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author guochao
 * @version 1.0
 * @date 2022/2/23 12:39
 */
public class Demo {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/bgxt_2021_4");
        dataSource.setUsername("root");
        dataSource.setPassword("666666");

        QueryRunner run = new QueryRunner(dataSource);
        try {
//            Map<String, Object> map = run.query("SELECT * FROM menu WHERE id=?", new MapHandler(), 1);
//            System.out.println(map);
f
            List<Object> show_sdatabsases = run.query("show databases", new ColumnListHandler<String>());
            System.out.println(show_databases.size());
        } catch (SQLException e) {sds
            e.printStackTrace();d
        }
    }
}
