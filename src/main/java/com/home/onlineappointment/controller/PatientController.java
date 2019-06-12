package com.home.onlineappointment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.onlineappointment.dao.DoctorDao;
import com.home.onlineappointment.dao.PatientDao;
import com.home.onlineappointment.model.Appointmentt;
import com.home.onlineappointment.model.Doctorr;
import com.home.onlineappointment.model.Patientt;

@Controller
public class PatientController {

	@Autowired
	private DoctorDao ddao;
	
	@Autowired
	private PatientDao pdao;
	
	@RequestMapping(value="/appointment", method=RequestMethod.POST)
	public String gotoAppointmentPage(@ModelAttribute Appointmentt a,HttpSession session,Model model){
		
		Doctorr doc=ddao.getinfo(a.getApto());
		Patientt pat=pdao.getInfo(a.getApfrom());
		
		model.addAttribute("doctor", doc);
		model.addAttribute("patient", pat);
		
		return "appointmentpage";
	}
	
	@RequestMapping(value="/patienthome", method=RequestMethod.GET)
	public String gotoPatientHome(Model model){
		
		model.addAttribute("dlist",ddao.getAll());
		return "patienthomepage";
	}
	
	
}
