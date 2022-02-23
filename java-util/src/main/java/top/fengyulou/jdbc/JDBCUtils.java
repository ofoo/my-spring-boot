package top.fengyulou.jdbc;

import java.sql.*;
import java.util.List;

/**
 * @Author guochao
 * @Date 2022/2/24 0:21
 * @Version 1.0
 */
public class JDBCUtils {
    //创建一个ThreadLocal对象，以当前线程作为key
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    private static ThreadLocal<PreparedStatement> threadLocal2 = new ThreadLocal<>();

    //加载驱动，并建立数据库链接
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://127.0.0.1:3306";
        String username = "root";
        String password = "666666";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static void executeDDL(String sql) {
        Connection conn = getConnection();
        PreparedStatement preStmt = null;
        try {
            preStmt = conn.prepareStatement(sql);
            preStmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        release(preStmt, conn);
    }

    public static void executeDDL(List<String> sqlList) {
        Connection conn = getConnection();
        PreparedStatement preStmt = null;
        try {
            for (String sql : sqlList) {
                preStmt = conn.prepareStatement(sql);
                preStmt.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        release(preStmt, conn);
    }

    //关闭数据库链接，释放资源
    public static void release(PreparedStatement preStmt, Connection conn) {
        if (preStmt != null) {
            try {
                preStmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void release(ResultSet rs, PreparedStatement preStmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        release(preStmt, conn);
    }
}
