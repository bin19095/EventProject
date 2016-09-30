/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.Services;

import com.event.Entity.EvEntity;
import com.event.access.AccessManager;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author HP
 */
@Path("/u")
public class tryService {
@Path("/get")
@GET
@Produces(MediaType.APPLICATION_JSON)
public String getjson() throws Exception{
    EvEntity e=new EvEntity();
    AccessManager ac=new AccessManager();
    List info=ac.getEvent_Manager();
    Iterator<EvEntity> values=info.iterator();
    while(values.hasNext()){
        EvEntity utt=values.next();
    System.out.println(""+utt.getUser_Email());
    }
    return "ok";
    
}
} 
