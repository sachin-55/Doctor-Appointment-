package com.home.onlineappointment.dao;

import com.home.onlineappointment.model.Adminn;

public interface AdminDao {

	public void signupAdmin(Adminn a);
	public Adminn verifyAdmin(String un , String psw);
	public Adminn getInfo(int id);

}
