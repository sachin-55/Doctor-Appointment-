package com.home.onlineappointment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(value="/adminlogout", method=RequestMethod.GET)
	public String adminLogout(HttpSession session){
		session.invalidate();
		return "admin";
	}
	@RequestMapping(value="/patientlogout", method=RequestMethod.GET)
	public String patientLogout(HttpSession session){
		session.invalidate();
		return "patient";
	}
	@RequestMapping(value="/doctorlogout", method=RequestMethod.GET)
	public String doctorLogout(HttpSession session){
		session.invalidate();
		return "doctor";
	}
	
}
