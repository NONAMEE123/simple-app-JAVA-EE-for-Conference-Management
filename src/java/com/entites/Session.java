/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entites;

/**
 *
 * @author KHALID-RAMI
 */
public class Session {
    private Integer id;
     private String session_name;
     private String president_name;
     private String comite_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getPresident_name() {
        return president_name;
    }

    public void setPresident_name(String president_name) {
        this.president_name = president_name;
    }

    public String getComite_name() {
        return comite_name;
    }

    public void setComite_name(String comite_name) {
        this.comite_name = comite_name;
    }

    @Override
    public String toString() {
        return "Session{" + "id=" + id + ", session_name=" + session_name + ", president_name=" + president_name + ", comite_name=" + comite_name + '}';
    }
     
    
    
    
}
