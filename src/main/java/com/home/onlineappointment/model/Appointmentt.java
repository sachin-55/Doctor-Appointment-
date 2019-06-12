package com.home.onlineappointment.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment")
public class Appointmentt {

	@Id
	@GeneratedValue
	private int appid;
	private int apfrom;
	private int apto;
	private String hospital;
	private Date grantdate;
	private int patientstatus;
	private Date reqdate;
	private String apptime;
	private String problem;
	
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public int getApfrom() {
		return apfrom;
	}
	public void setApfrom(int apfrom) {
		this.apfrom = apfrom;
	}
	public int getApto() {
		return apto;
	}
	public void setApto(int apto) {
		this.apto = apto;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public Date getGrantdate() {
		return grantdate;
	}
	public void setGrantdate(Date grantdate) {
		this.grantdate = grantdate;
	}
	public int getPatientstatus() {
		return patientstatus;
	}
	public void setPatientstatus(int patientstatus) {
		this.patientstatus = patientstatus;
	}
	public Date getReqdate() {
		return reqdate;
	}
	public void setReqdate(Date reqdate) {
		this.reqdate = reqdate;
	}
	public String getApptime() {
		return apptime;
	}
	public void setApptime(String apptime) {
		this.apptime = apptime;
	}
	
	
	
	
}
