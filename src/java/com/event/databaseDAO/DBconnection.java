/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.event.databaseDAO;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author HP
 */
public class DBconnection {
    
public Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
               Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventdatabase", "root", "");
            System.out.println("connected");
            return con;
        } catch (Exception ex) {
            System.out.println("error db connecting" + ex);
        throw ex;
        }
   }
}
