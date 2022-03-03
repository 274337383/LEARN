package icu.maiddragon.web;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // 1.注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2.获取连接
            String url = "jdbc:mysql://maiddragon.icu:3306/test";
            String user = "root";
            String password = "Acceleator2018";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("数据库连接对象:"+conn);

            // 3.获取数据库连接对象
            stmt = conn.createStatement();
//            int count = stmt.executeUpdate("INSERT INTO test.user(username, password, address) VALUES('林凯民',MD5('123456.88'),'漳州市漳浦县')");
            int count = stmt.executeUpdate("UPDATE test.user SET address='漳州市漳浦县' WHERE username='林凯民'");
            System.out.println(count == 1 ? "保存成功":"保存失败");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6.释放资源
            // 为了保证资源一定释放,在finally语句块中关闭资源
            // 并且要遵循从小到大依次关闭
            // 分别对其try{catch{}}
            try {
                if (stmt!=null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
