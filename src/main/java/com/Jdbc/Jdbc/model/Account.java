package com.Jdbc.Jdbc.model;


import java.sql.Timestamp;


import javax.persistence.*;


@Entity
@Table(name = "account")
public class Account  {
    
    @Id
    @GeneratedValue
    private int id;
    
	private String username;
	private String password;
	private Integer userId;
	private Timestamp createDtm;



	public Account() {

	}
    
    public Account(String username, String password, Integer userId, Timestamp createDtm) {
		this.username = username;
		this.password= password;
		this.userId = userId;
		this.createDtm = createDtm;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id() {
        return id;
    }
    public void setId(Integer Id) {
        this.id = Id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    } 
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreateDtm() {
        return createDtm;
    }

    public void setCreateDtm(Timestamp createDtm) {
        this.createDtm = createDtm;
    }

    public Integer getuserId() {
        return userId;
    }

    public void setuserId(Integer userId) {
        this.userId = userId;
    }
}
