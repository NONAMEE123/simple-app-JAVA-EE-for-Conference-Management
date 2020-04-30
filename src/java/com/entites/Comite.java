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
public class Comite {
    private Integer id;
     private String first_name;
     private String last_name;
     private String conference_title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getConference_title() {
        return conference_title;
    }

    public void setConference_title(String conference_title) {
        this.conference_title = conference_title;
    }

    @Override
    public String toString() {
        return "Comite{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", conference_title=" + conference_title + '}';
    }
  
    
}
