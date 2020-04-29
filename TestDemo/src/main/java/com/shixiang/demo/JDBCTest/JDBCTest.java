package com.shixiang.demo.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {
    public static void main(String[] args) throws Exception{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs= null;

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            // 获取statement，preparedStatement
            String sql = " select * from api_server where api_id=?";
            preparedStatement = connection.prepareStatement(sql);
            //设置参数
            preparedStatement.setLong(1, 1);
            //执行查询
            rs = preparedStatement.executeQuery();
            System.out.println(rs.getString("api_desc"));
        }
        finally {
            if(rs!=null){
                rs.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }
            if(connection!=null)
            {
                connection.close();
            }
        }
    }
}
