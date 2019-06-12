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
import com.home.onlineappointment.model.Doctorr;

@Controller
public class AdminController {
	
	@Autowired
	private DoctorDao ddao;
	
	@Autowired
	private PatientDao pdao;
	
	@RequestMapping(value="/adminhomebtn", method=RequestMethod.GET)
	public String adminHomeClick(HttpSession session,Model model){
		session.setMaxInactiveInterval(500);
		
		model.addAttribute("plist",pdao.getAll());
		model.addAttribute("dlist",ddao.getAll());
		
		return "adminhomepage";
	}
	
	@RequestMapping(value="/admindoctor", method=RequestMethod.GET)
	public String adminDoctorClick(HttpSession session,Model model){
		session.setMaxInactiveInterval(500);
		
		model.addAttribute("dlist",ddao.getAll());
		
		return "admindoctorinfo";
	}
	
	@RequestMapping(value="/adminpatient", method=RequestMethod.GET)
	public String adminPatientClick(HttpSession session,Model model){
		session.setMaxInactiveInterval(500);

		model.addAttribute("plist",pdao.getAll());

		return "adminpatientinfo";
	}
	
	@RequestMapping(value="/activate", method=RequestMethod.POST)
	public String activateDoctor(@ModelAttribute Doctorr d,Model model){
		d.setStatus(1);
		ddao.updateStatus(d);
		
		model.addAttribute("plist",pdao.getAll());
		model.addAttribute("dlist",ddao.getAll());
		return "admindoctorinfo";

	}
	
	@RequestMapping(value="/deactivate", method=RequestMethod.POST)
	public String deactivateDoctor(@ModelAttribute Doctorr d,Model model){
		d.setStatus(0);
		ddao.updateStatus(d);
		
		model.addAttribute("plist",pdao.getAll());
		model.addAttribute("dlist",ddao.getAll());
		return "admindoctorinfo";

	}
}
