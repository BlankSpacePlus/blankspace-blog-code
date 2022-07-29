package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <a href="https://juejin.cn/post/7084632552018968583">文章链接</a>
 */
public class JDBCDemo {

    public static void main(String[] args) {
        String driverName="com.mysql.cj.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306/dbName?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai";
        // 你的登录名，自己写，比如root
        String userName="userName";
        // 你的登录密码，自己写
        String userPassword="userPassword";
        try {
            Class.forName(driverName);
            System.out.println("加载MySQL驱动成功");
        } catch (ClassNotFoundException e) {
            System.out.println("加载MySQL驱动失败");
        }
        try (Connection dbConnection = DriverManager.getConnection(dbURL, userName, userPassword)) {
            System.out.println("连接数据库成功");
        } catch(SQLException e) {
            System.out.println("数据库连接失败");
        }
    }

}
