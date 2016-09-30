/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.Services;

import com.event.Entity.EvEntity;
import com.event.access.AccessManager;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author HP
 */
@Path("/jsonFormat")
public class jsonFormat {
    AccessManager ac=new AccessManager();
    
    @GET 
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EvEntity> getJson() throws Exception{
        return ac.getEvent_Manager();
    }
    
}
