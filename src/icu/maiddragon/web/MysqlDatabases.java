package icu.maiddragon.web;

import com.mysql.cj.xdevapi.Result;

import java.sql.*;

public class MysqlDatabases {
    // 声明Connection对象
    Connection con;
    // 驱动程序名
    String driver = "com.mysql.cj.jdbc.Driver";
    // mysql配置时的用户名
    String user = "root";
    // mysql配置时的密码
    String password = "Acceleator2018";
    public void Conn(String url) {
        // 遍历查询结果集
        try {
            // 加载驱动程序
            Class.forName(driver);
            // 1.getConnection()方法,连接mysql数据库
            con = DriverManager.getConnection(url,user,password);
            if (!con.isClosed())
                System.out.println("Succeeded connecting to the Databases!");
            // 2.创建statement类对象,用来执行sql语句
            Statement statement = con.createStatement();
            // 要执行的sql语句
            String sql = "select * from test.emp";
            // 3.ResultSet类,用来存放获取的结果集
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("----------------");
            System.out.println("执行结果如下所示:");
            System.out.println("----------------");
            System.out.println("姓名"+"\t"+"职称");
            System.out.println("----------------");
            String job = null;
            String id = null;
            while (rs.next()) {
                //获取stuname这列数据
                job = rs.getString("job");
                // 获取stuid这列数据
                id = rs.getString("ename");

                // 输出结果
                System.out.println(id+"\t\t"+job);
            }
            rs.close();
            con.close();
        } catch (ClassNotFoundException Error) {
            // 数据库驱动类异常处理
            System.out.println("Sorry,can't find the Driver!");
            Error.printStackTrace();
        } catch (SQLException Error) {
            // 数据库连接失败异常处理
            Error.printStackTrace();
        } catch (Exception Error) {
            // TODO: handle exception
            Error.printStackTrace();
        } finally {
            System.out.println("数据库数据成功获取!!!");
        }
    }
}
