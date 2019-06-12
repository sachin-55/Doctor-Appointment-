package com.home.onlineappointment.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patientt {

	@Id
	@GeneratedValue
	private int pid;
	private String fnamep;
	private String lnamep;
	private String genderp;
	private String phonep1;
	private String phonep2;
	private String emailp;
	private String usernamep;
	private String passwordp;
	private String addressp;
	private String imagep;
	private Date dobp;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFnamep() {
		return fnamep;
	}
	public void setFnamep(String fnamep) {
		this.fnamep = fnamep;
	}
	public String getLnamep() {
		return lnamep;
	}
	public void setLnamep(String lnamep) {
		this.lnamep = lnamep;
	}
	public String getGenderp() {
		return genderp;
	}
	public void setGenderp(String genderp) {
		this.genderp = genderp;
	}
	public String getPhonep1() {
		return phonep1;
	}
	public void setPhonep1(String phonep1) {
		this.phonep1 = phonep1;
	}
	public String getPhonep2() {
		return phonep2;
	}
	public void setPhonep2(String phonep2) {
		this.phonep2 = phonep2;
	}
	public String getEmailp() {
		return emailp;
	}
	public void setEmailp(String emailp) {
		this.emailp = emailp;
	}
	public String getUsernamep() {
		return usernamep;
	}
	public void setUsernamep(String usernamep) {
		this.usernamep = usernamep;
	}
	public String getPasswordp() {
		return passwordp;
	}
	public void setPasswordp(String passwordp) {
		this.passwordp = passwordp;
	}
	public String getAddressp() {
		return addressp;
	}
	public void setAddressp(String addressp) {
		this.addressp = addressp;
	}
	public String getImagep() {
		return imagep;
	}
	public void setImagep(String imagep) {
		this.imagep = imagep;
	}
	public Date getDobp() {
		return dobp;
	}
	public void setDobp(Date dobp) {
		this.dobp = dobp;
	}

	
}
