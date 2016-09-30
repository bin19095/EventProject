/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.DAO;

import com.event.Entity.AddingEventEntity;
import com.event.Entity.EvEntity;
import com.event.databaseDAO.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class event_invoker {
    int i=0;
   AddingEventEntity add_event=new AddingEventEntity();
    public int eventInsertion(Integer event_id,String event_time,String event_address,String event_organiser,String event_title,Connection con) throws SQLException{
 add_event.setEvent_id(event_id);
 add_event.setEvent_address(event_address);
 add_event.setEvent_time(event_time);
 add_event.setEvent_organiser(event_organiser);
 add_event.setEvent_title(event_title);
 

System.out.println("here");
 try{
     PreparedStatement pstmt=con.prepareStatement("INSERT INTO eventdatabase.user_event_details (event_id,event_time,event_address,event_organiser,event_title) VALUES(?,?,?,?,?)");
     pstmt.setInt(1,add_event.getEvent_id());
     pstmt.setString(2,add_event.getEvent_time());
     pstmt.setString(3,add_event.getEvent_address());
     pstmt.setString(4,add_event.getEvent_organiser());
     pstmt.setString(5,add_event.getEvent_title());
     i = pstmt.executeUpdate();
     System.out.println("something no boin gwel");
 }catch(Exception e){
        System.out.print("Error Insertion @ Event_invoker"+e);
    }
 return i;
    }
//    public static void main(String args[]) throws Exception{
//  int i=0;
//        event_invoker test=new event_invoker();
//         DBconnection db_Event = new DBconnection();
//     Connection con_Event = db_Event.getConnection();
//i=test.eventInsertion(11, "12", "ade", "event_organiser", "event_title", con_Event);
//    System.out.println("?"+i);
//    }
//    
}
