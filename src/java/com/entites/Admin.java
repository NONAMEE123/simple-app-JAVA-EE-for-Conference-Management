package com.entites;




// Generated 1 janv. 2019 19:11:57 by Hibernate Tools 4.3.1



/**
 * Admin generated by hbm2java
 */
public class Admin  implements java.io.Serializable {


     private Integer id;
     private String first_name;
     private String last_name;
     private String email;
     private String username;
     private String password;

    public Admin() {
    }

    public Admin(int id,String firstName, String lastName, String email, String username, String password) {
        this.id=id;
       this.first_name = firstName;
       this.last_name = lastName;
       this.email = email;
       this.username = username;
       this.password = password;
    }   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.first_name;
    }
    
    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }
    public String getLastName() {
        return this.last_name;
    }
    
    public void setLastName(String lastName) {
        this.last_name = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


