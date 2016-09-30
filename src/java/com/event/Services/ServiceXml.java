/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.Services;

import com.event.Entity.EvEntity;
import com.event.access.AccessManager;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author HP
 */
@Path("/serviceXml")
public class ServiceXml {
    AccessManager ac=new AccessManager();
     
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/events")
    public ArrayList<EvEntity>getUserEvent() throws Exception{
            return ac.getEvent_Manager();
}
}
