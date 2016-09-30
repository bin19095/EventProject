/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.access;

/**
 *
 * @author HP
 */
import com.event.Entity.AddingEventEntity;
import com.event.Entity.EvEntity;
import com.event.databaseDAO.DBconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
 

 
public class AccessManager
{
public ArrayList<EvEntity> getEvent_Manager() throws Exception
{
ArrayList<EvEntity> eventList = new ArrayList<EvEntity>();
DBconnection db = new DBconnection();
Connection con = db.getConnection();
Access access = new Access();
//eventList = access.getEvent_method(con);
eventList=access.getEvent_Method(con);
return eventList;
}
public ArrayList<AddingEventEntity> getAccess_Event() throws Exception{
    ArrayList<AddingEventEntity> access_event_list=new ArrayList<AddingEventEntity>();
    DBconnection db=new DBconnection();
    Connection conn=db.getConnection();
    AccessEvent ae=new AccessEvent();
    access_event_list=ae.getAccess_Event(conn);
return access_event_list;
}
public int testing_user(String Email,String Password)throws Exception{
        int test=0;
       String getEmail=Email;
       String getPassword=Password;
        List Inf_Ac=getEvent_Manager();
                 Iterator<EvEntity> values=Inf_Ac.iterator();
                 while(values.hasNext()){
                    EvEntity et_check=values.next();
if(et_check.getUser_Email().equals(getEmail)&& et_check.getUser_Password().equals(getPassword)){
//System.out.println("helo");
    test=1;
break;
}
else{
    test=0;
}
                 }
return test;
    
}
public static void main(String args[]){
    try {
        int t=0;
        AccessManager ac=new AccessManager();
      // t=ac.testing_user("b@b","hello");
       ArrayList<AddingEventEntity> accessList = new ArrayList<AddingEventEntity>();
// if(t!=0){ 
//       System.out.println("longin");
//       }
//       else{
//           System.out.println("invalid");
//       }
//        accessList = ac.getAccess_Event();
      
        accessList = ac.getAccess_Event();
System.out.println(""+accessList);
 ArrayList<EvEntity> eventList=new ArrayList<EvEntity>();
        AccessManager act=new AccessManager();
        eventList=act.getEvent_Manager();
        System.out.println(""+eventList);
    } catch (Exception ex) {
        Logger.getLogger(AccessManager.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}
