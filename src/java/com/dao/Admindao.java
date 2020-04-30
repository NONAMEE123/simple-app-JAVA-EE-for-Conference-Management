/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import com.entites.Admin;
import com.metier.IAdmin;
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
public class Admindao implements IAdmin{

    
    public Admin find() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Admin find1(int id) {
      Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM Admin WHERE id = ?");
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			result.next();
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			String email = result.getString("email");
                        String username = result.getString("username");
			String password = result.getString("password");
			Admin admin = new Admin(id, firstName, lastName, email,username,password);
			return admin;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
	}

    @Override
    public void add(Admin admin) {
        Connection connection = ConfigDB.getInstance().getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("insert into admin values(Null,?,?,?,?,?)");
		
			ps.setString(1, admin.getFirstName());
			ps.setString(2, admin.getLastName());
			ps.setString(3, admin.getEmail());
                        ps.setString(4, admin.getUsername());
                        ps.setString(5, admin.getPassword());
			
			ps.executeUpdate();
			 
                         ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void update(Admin admin) {
       Connection connection = ConfigDB.getInstance().getConnection();
		 PreparedStatement ps;
	      try {
	          ps = connection.prepareStatement(
	                  "update Admin set first_name=?, last_name=?, email=?,username=? , password=?, where id=?");
	            ps.setInt(6,admin.getId());
				ps.setString(1, admin.getFirstName());
				ps.setString(2, admin.getLastName());
				ps.setString(3, admin.getEmail());
                                ps.setString(4, admin.getUsername());
				ps.setString(5, admin.getPassword());
                                
				
				ps.executeUpdate();
				ps.close();
	      } catch (SQLException ex) {
	          System.out.println("erreur ! ");
	      }
		return ;
	}


    public void delete(int id) {
Connection connection = ConfigDB.getInstance().getConnection();

		try {
			PreparedStatement pr=(PreparedStatement) connection.prepareStatement("DELETE FROM Admin WHERE id=?");
		    pr.setInt(1,id);
			pr.execute();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }

    @Override
    public Collection<Admin> findAll() {
Connection connection = ConfigDB.getInstance().getConnection();
		Collection<Admin> admins = new ArrayList<Admin>();

		try {
			PreparedStatement stmt;
			stmt = connection.prepareStatement("SELECT * FROM Admin");
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String first_name = result.getString("first_name");
				String last_name = result.getString("last_name");
				String email = result.getString("email");
                                String username = result.getString("username");
                                String password = result.getString("password");
                                Admin admin = new Admin(id, first_name, last_name, email,username,password);
				admins.add(admin);
			}
			return admins;
		} catch (SQLException e) {
			System.out.println("Erreur SQL " + e.getMessage());
		}

		return null;
    }
    
    
}
