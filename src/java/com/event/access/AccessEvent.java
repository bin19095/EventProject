/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.access;

import com.event.Entity.AddingEventEntity;
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
public class AccessEvent {
    public ArrayList<AddingEventEntity> getAccess_Event(Connection con) throws SQLException{
                ArrayList<AddingEventEntity> accessList=new ArrayList<AddingEventEntity>();
        PreparedStatement stmt=con.prepareStatement("SELECT * FROM user_event_details");
        ResultSet rs=stmt.executeQuery();
        try{
            while(rs.next()){
                AddingEventEntity addEntity=new AddingEventEntity();
                addEntity.setEvent_id(rs.getInt("event_id"));
                addEntity.setEvent_time(rs.getString("event_time"));
                addEntity.setEvent_address(rs.getString("event_address"));
                addEntity.setEvent_organiser(rs.getString("event_organiser"));
                addEntity.setEvent_title(rs.getString("event_title"));
           accessList.add(addEntity);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return accessList;
    }
    public static void main(String args[]) throws Exception{
        AccessEvent as=new AccessEvent();
        DBconnection db = new DBconnection();
        Connection con = db.getConnection();
       System.out.println(""+ as.getAccess_Event(con));
    }
    
}
