/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.entites.Conference;
import com.metier.IConference;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author KHALID-RAMI
 */
public class conferencedao implements IConference{
    
    
    public void add(Conference conference) {
        Connection connection = ConfigDB.getInstance().getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("insert into  values(?,?,?,?,?,?,?)");
		
			ps.setString(1,conference.getTitle());
			ps.setString(2, conference.getStartDate());
			ps.setString(3, conference.getEndDate());
                        ps.setString(4, conference.getdate_conf());
                        ps.setString(5, conference.getLocation());
                        ps.setString(6, conference.getDescription());
                        ps.setString(7, conference.getDateLimite());

			
			ps.executeUpdate();
			 
                         ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }   
    public void delete(String title) {
Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement pr=(PreparedStatement) connection.prepareStatement("DELETE FROM conference WHERE title=?");
		    pr.setString(1,title);
			pr.execute();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }

}
