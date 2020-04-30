/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHALID-RAMI
 */
public class Db_Connection 
{
    public Connection Connection()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String TechWorld3g_2 = "jdbc:mysql://localhost:3306/uml_jee?user=root";
            Connection myConnection = DriverManager.getConnection(TechWorld3g_2);
            
            return myConnection;
        } catch (ClassNotFoundException | SQLException ex) {Logger.getLogger(Db_Connection.class.getName()).log(Level.SEVERE, null, ex);}
        return null;
    }
}
