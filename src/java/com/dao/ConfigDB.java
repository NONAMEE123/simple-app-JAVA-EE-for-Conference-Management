/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConfigDB {
	private static ConfigDB instance;
	private ConfigDB() {
		
	}
	
	public static ConfigDB getInstance() {
		if(instance == null) {
			instance = new ConfigDB();
		}
		return instance;
	}
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/uml_jee", "root", "");
		} catch (Exception e) {
			System.out.println("Erreur " + e.getMessage());
		}
		return connection;
	}
}

       

