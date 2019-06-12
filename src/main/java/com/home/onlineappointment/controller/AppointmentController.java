package com.home.onlineappointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.onlineappointment.dao.AppointmentDao;
import com.home.onlineappointment.model.Appointmentt;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentDao appdao;
	
	@RequestMapping(value="/registerAppointment", method=RequestMethod.POST)
	public String registeringAppointment(@ModelAttribute Appointmentt app){
		appdao.registerAppointment(app);
		
		return "appointmentpage";
	}
}
