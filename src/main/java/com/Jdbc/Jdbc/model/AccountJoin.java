package com.Jdbc.Jdbc.model;

public class AccountJoin extends Account{
    private String firstname;
	private String lastname;
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
