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
            String sql = "update estudiantePoo set b1 = ? where cedula = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, 19.90);
            pstmt.setString(2, "0338943111");
            pstmt.executeUpdate();



        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            //cerramos la conexion
            try{
                if(pstmt != null){
                    pstmt.close();
                }
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}