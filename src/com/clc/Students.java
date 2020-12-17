package com.clc;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Students {

	@Id
	private int admno;
	private String fullname;
	private String gender;
	private String email;
	
	public int getAdmno() {
		return admno;
	}
	public void setAdmno(int admno) {
		this.admno = admno;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
