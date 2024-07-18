package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/clase02";
        String user = "root";
        String password = "123456";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            //establecer la conexion
            conn = DriverManager.getConnection(url,user,password);
            //sentencia sql
            String sql = "update estudiantePoo set b1 = ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "111");
            pstmt.setString(2, "111");


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}