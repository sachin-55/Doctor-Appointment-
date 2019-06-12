package com.home.onlineappointment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavBarController {

	@RequestMapping(value="/doctor", method=RequestMethod.GET)
	public String gotoDoctor(){
		return "doctor";
	}
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String gotoHome(){
		return "home";
	}
	@RequestMapping(value="/patient", method=RequestMethod.GET)
	public String gotoPatient(){
		return "patient";
	}
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String gotoAdmin(){
		return "admin";
	}
	

	
}
