package com.home.onlineappointment.dao;

import java.util.List;

import com.home.onlineappointment.model.Patientt;

public interface PatientDao {

	public void signupPatient(Patientt p);
	public Patientt verifyPatient(String un , String psw);
	public List<Patientt> getAll();
	public Patientt getInfo(int id);
}
