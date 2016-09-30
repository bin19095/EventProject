/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.DAO;

import com.event.Entity.EvEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author HP
 */
public class registration {
    EvEntity reg_entity=new EvEntity();
    
   public int goregistration(String Email  ,String Password,Connection con ){
       Integer i=0; 
    reg_entity.setUser_Email(Email);
    reg_entity.setUser_Password(Password);
       try{
           PreparedStatement pstmt=con.prepareStatement("INSERT INTO eventdatabase.user_register (User_Email,User_Password) VALUES(?,?)");
       pstmt.setString(1,reg_entity.getUser_Email());
       pstmt.setString(2,reg_entity.getUser_Password());
       i=pstmt.executeUpdate();
       con.close();
       }
       catch(Exception e){
           System.out.print("Error Insertion"+e);
       }
       return i;
        
    }
    
}
