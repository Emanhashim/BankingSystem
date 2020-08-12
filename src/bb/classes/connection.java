package bb.classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cs
 */
public class connection {
   public static Connection getConn() throws SQLException {
        //Class.forName("com.mysql.jdbc.Driver");//optional in the new version of java(1.4 later)
        String dbUrl = "jdbc:mysql://localhost:3306/bank_system";
        String UserName = "root";
        String Password = "root12";
        return DriverManager.getConnection(dbUrl, UserName, Password);
    } 
    
    
    
}
