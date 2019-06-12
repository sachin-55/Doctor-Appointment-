package com.home.onlineappointment.dao;

import java.util.List;

import com.home.onlineappointment.model.Appointmentt;

public interface AppointmentDao {
	
	public void registerAppointment(Appointmentt p);
	public List<Appointmentt> findDoctor(int id);
	public Appointmentt getInfo(int id);
	public void updateStatus(Appointmentt a);
	public void updateDate(Appointmentt a);
}
