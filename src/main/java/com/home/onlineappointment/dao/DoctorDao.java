package com.home.onlineappointment.dao;

import java.util.List;

import com.home.onlineappointment.model.Doctorr;

public interface DoctorDao {

	public void signupDoctor(Doctorr d);
	public Doctorr verifyDoctor(String un,String psw);
	public List<Doctorr> getAll();
	public void updateStatus(Doctorr d);
	public Doctorr getinfo(int id);
}
