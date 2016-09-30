/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.Services;

import com.event.Entity.EvEntity;
import com.event.access.AccessManager;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author HP
 */
@Path("/eventServices")
public class EventServices {
    @GET
   
    @Produces(MediaType.APPLICATION_JSON)
     @Path("/events")
    public String events()
    {
       // return "test";
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
}
        
   







//  System.out.println(""+event_details);  
//return event_details;
//}
//@POST
//@Consumes({MediaType.APPLICATION_JSON})
//@Produces({MediaType.TEXT_PLAIN})
//@Path("/post")
//public String postEvent(EvEntity ent) throws Exception{
//    System.out.println("email"+ent.getUser_Email());
//    System.out.println("user"+ent.getUser_Password());
//    return "ok"+ent.getUser_Email();
            
//}

