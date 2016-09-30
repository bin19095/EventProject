/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.Entity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author HP
 */
public class EvEntity {
    Integer LoginId;
    String User_Email;    
    String User_Password;
//    public EvEntity() {
//    }

  

    
    public Integer getLoginId() {
        return LoginId;
    }

    public EvEntity() {
    }

        public EvEntity(Integer LoginId, String User_Email, String User_Password) {
        this.LoginId = LoginId;
        this.User_Email = User_Email;
        this.User_Password = User_Password;
    }
      public EvEntity( String User_Email, String User_Password) {
       
        this.User_Email = User_Email;
        this.User_Password = User_Password;
    }
@XmlElement
    public void setLoginId(Integer LoginId) {
        this.LoginId = LoginId;
    }

    public String getUser_Email() {
        return User_Email;
    }
@XmlElement

    public void setUser_Email(String User_Email) {
        this.User_Email = User_Email;
    }

    public String getUser_Password() {
        return User_Password;
    }

   
@XmlElement

    public void setUser_Password(String User_Password) {
        this.User_Password = User_Password;
    }

   


   
    
}
