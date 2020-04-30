/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class amal {
	public static void insererImage(String title, String chemin) {
		   File file = new File(chemin);
		   try{
		      //lien vers la base de données
		      Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/uml_jee","root","");
 
		      //lien vers notre fichier image
		      FileInputStream stream = new FileInputStream(file);
 
		      //préparation de l'instruction SQL
		      String sql = "INSERT INTO papier VALUES (?, ?)";
		      PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
 
		      //insertion de l'image
		      statement.setString(1, title);
		      statement.setBinaryStream(2, stream, (int)file.length());
		      statement.executeUpdate();
 
		    }catch(Exception e){
		       //traitement des erreurs SQL, IO, etc .
		    }finally {
		       //fermeture de la connexion, du flux, etc.
		    }
 
	}}