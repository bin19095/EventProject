/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.DAOImp;



import com.event.DAO.event_invoker;
import com.event.Entity.EvEntity;
import com.event.access.AccessManager;
import com.event.databaseDAO.DBconnection;
import com.google.gson.Gson;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import com.event.DAO.registration;
import com.event.Entity.AddingEventEntity;
/**
 *
 * @author HP
 */
@Path("/db")
public class registerDAO {
 DBconnection dd=new DBconnection();
 EvEntity Ev=new EvEntity();
   Integer i=0;
   String Email_1;
   String Password_1;
 
 @POST
 @Produces(MediaType.TEXT_HTML)
 @Path("/insert")
// public String goInsertion(@Context HttpServletRequest request){

 public String goInsertion(@FormParam("Email") String Email,
         @FormParam("Password" ) String Password) throws Exception{
     int i=0;    
     
     DBconnection db_Signup = new DBconnection();
     Connection con_Signup = db_Signup.getConnection();
     EvEntity En=new EvEntity();
     registration reg=new registration();
     i=reg.goregistration(Email, Password, con_Signup);
     if(i>0){
return "Updated <h1><a href=http://localhost:8080/Event_Handler/Login.jsp> login</a>";
     }else{
     return "failed";
     }
 }
  @GET
   
    @Produces(MediaType.APPLICATION_JSON)
     @Path("/events")
    public String events()
    {
        String events=null;
        ArrayList<EvEntity> eventList=new ArrayList<EvEntity>();
        try{
            eventList=new AccessManager().getEvent_Manager();
            Gson gson=new Gson();
            events=gson.toJson(eventList);
           }catch(Exception e){
        e.printStackTrace();
            }
        System.out.println("step");
        return "There we go"+events;
    }
    @POST//not working this method have to invest....****
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/post")
    public String getWeb_Json(EvEntity En) throws Exception{
     System.out.println("Email:"+En.getUser_Email());
     System.out.println("password:"+En.getUser_Password());
    return "Good";
    }
    
 @POST
 @Produces(MediaType.TEXT_HTML)
 @Path("/insetEvent")
// public String goInsertion(@Context HttpServletRequest request){

 public String eventParam(@FormParam("id") int id,
         @FormParam("time") String time,
         @FormParam("address")String address,
         @FormParam("organiser")String organiser,
         @FormParam("title")String title) throws Exception{
     int i=0;    
     
     DBconnection db_Event = new DBconnection();
     Connection con_Event = db_Event.getConnection();
     //EvEntity En=new EvEntity();
     AddingEventEntity adEvent=new AddingEventEntity();
     //registration reg=new registration();
     event_invoker event_in=new event_invoker();
     i=event_in.eventInsertion(id, time,address,organiser,title,con_Event);
     if(i>0){
return "Updated <h1><a href=${pageContext.request.contextPath}/Dashboard.jsp> Return to dashboard</a>";
     }else{
     return "failed to update events"+title+""+id+""+time+""+address+""+organiser+""+title;
     }
 }
 
}
   
