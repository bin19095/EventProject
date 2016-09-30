/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.Entity;

/**
 *
 * @author HP
 */
public class AddingEventEntity {
    int event_id;
    String event_time;

    public AddingEventEntity() {
    }

    public AddingEventEntity(int event_id, String event_time, String event_address, String event_organiser,String event_title) {
        this.event_id = event_id;
        this.event_time = event_time;
        this.event_address = event_address;
        this.event_organiser = event_organiser;
        this.event_title=event_title;
    }
    String event_address;
    String event_organiser;
    String event_title;

    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public AddingEventEntity(int event_id) {
        this.event_id = event_id;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getEvent_time() {
        return event_time;
    }

    public void setEvent_time(String event_time) {
        this.event_time = event_time;
    }

    public String getEvent_address() {
        return event_address;
    }

    public void setEvent_address(String event_address) {
        this.event_address = event_address;
    }

    public String getEvent_organiser() {
        return event_organiser;
    }

    public void setEvent_organiser(String event_organiser) {
        this.event_organiser = event_organiser;
    }
    
}
