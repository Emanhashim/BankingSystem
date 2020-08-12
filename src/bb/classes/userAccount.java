/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author cs
 */
public class userAccount {
    
    
     public boolean loginBank(String userName,String password) {
        boolean userExist = false;
        String sql = "SELECT * FROM useraccount WHERE UserName = '"+userName + "'  AND Password =   '"+ password +"';";
        try {
            Connection conn = connection.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            if (rst.next()) {
                UserInfo.username = rst.getString("UserName");
                UserInfo.password = rst.getString("Password");
                UserInfo.role = rst.getInt("UserRole");
                UserInfo.EmpId = rst.getString("UserEmpId");
                userExist = true;
            }
        } catch (Exception e) {
            userExist = false;
        }
        return userExist;
    }
}
    
    
    
    

