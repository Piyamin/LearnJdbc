package com.Jdbc.Jdbc.model;


import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "userprofile")
public class UserProfile {
    @Id
    @GeneratedValue
    private int id;
    
	private String firstname;
	private String lastname;
	private Integer category;
	private Timestamp createDtm;

	public UserProfile() {

	}
    public UserProfile(String firstname,String lastname,Integer category,Timestamp createDtm) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.category = category;
        this.createDtm = createDtm;
	}
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Timestamp getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Timestamp date) {
        this.createDtm = date;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
