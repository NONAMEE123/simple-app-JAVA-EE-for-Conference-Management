package com.entites;



// Generated 1 janv. 2019 19:11:57 by Hibernate Tools 4.3.1



/**
 * Conference generated by hbm2java
 */
public class Conference  implements java.io.Serializable {

private int id;
     private String title;
     private String start_date;
     private String end_date;
     private String date_conf;
     private String location;
     private String description;
     private String date_limite;

    public Conference() {
    }

    public Conference(int id,String title, String start_date, String end_date,String date_conf, String location, String description, String date_limite) {
       this.id=id;
        this.title = title;
       this.start_date = start_date ;
       this.end_date =end_date ;
       this.location = location;
       this.description = description;
       this.date_limite = date_limite;
    }
    
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
   
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getStartDate() {
        return this.start_date;
    }
    
    public void setStartDate(String startDate) {
        this.start_date = startDate;
    }
    public String getEndDate() {
        return this.end_date;
    }
    
    public void setEndDate(String endDate) {
        this.end_date = endDate;
    }
     public String getdate_conf() {
        return this.date_conf;
    }
    
    public void setdate_conf(String date_conf) {
        this.date_conf = date_conf;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
  
    public String getDateLimite() {
        return this.date_limite;
    }
    
    public void setDateLimite(String dateLimite) {
        this.date_limite = dateLimite;
    }




}


