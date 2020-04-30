/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metier;
import com.entites.Admin;
import java.util.Collection;

/**
 *
 * @author KHALID-RAMI
 */
public interface IAdmin {
    public Admin find(); 
	public Admin find1(int id); 
	public void add(Admin admin);
	public void update(Admin admin);
	public void delete(int id); 
	public Collection<Admin> findAll();
    
}
