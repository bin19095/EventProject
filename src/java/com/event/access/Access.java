/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.access;

import com.event.Entity.EvEntity;
import com.event.databaseDAO.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Access {
    public ArrayList<EvEntity> getEvent_Method(Connection con) throws SQLException
    {
        ArrayList<EvEntity> eventList=new ArrayList<EvEntity>();
        PreparedStatement stmt=con.prepareStatement("SELECT * FROM user_register");
        ResultSet rs=stmt.executeQuery();
        try{
            while(rs.next())
            {
                EvEntity eventEntity=new EvEntity();
                eventEntity.setLoginId(rs.getInt("LoginId"));
                eventEntity.setUser_Email(rs.getString("User_Email"));
                eventEntity.setUser_Password(rs.getString("User_Password"));
               eventList.add(eventEntity);
        }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return eventList;
   
    }
//public static void main(String args[]) throws Exception{
//        Access as=new Access();
//        DBconnection db = new DBconnection();
//        Connection con = db.getConnection();
//       System.out.println(""+ as.getEvent_Method(con));
//    }
    
}
