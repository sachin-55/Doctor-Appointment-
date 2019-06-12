package com.home.onlineappointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.onlineappointment.dao.AdminDao;
import com.home.onlineappointment.dao.DoctorDao;
import com.home.onlineappointment.dao.PatientDao;
import com.home.onlineappointment.model.Adminn;
import com.home.onlineappointment.model.Doctorr;
import com.home.onlineappointment.model.Patientt;



@Controller
public class SignupController {

	@Autowired
	private PatientDao pdao;

	@Autowired
	private AdminDao adao;
	
	@Autowired
	private DoctorDao ddao;
	
	@RequestMapping(value="/register_doctor", method=RequestMethod.GET)
	public String gotoDoctorRegisterPage(){
		return "doctorregister";
		
	}
	@RequestMapping(value="/register_patient", method=RequestMethod.GET)
	public String gotoPatientRegisterPage(){
		return "patientregister";
		
	}
	@RequestMapping(value="/register_admin", method=RequestMethod.GET)
	public String gotoAdminRegisterPage(){
		return "adminregister";
		
	}
	
	@RequestMapping(value="/registerpatient", method=RequestMethod.POST )
	public String gotoPatientHomepage(@ModelAttribute Patientt p){
		
		pdao.signupPatient(p);
		return "patient";
	}
	
	@RequestMapping(value="/registeradmin", method=RequestMethod.POST)
	public String gotoAdminHomepage(@ModelAttribute Adminn a){
		
		adao.signupAdmin(a);
		return "admin";
	}
	
	@RequestMapping(value="/registerdoctor",method=RequestMethod.POST)
	public String gotoDoctorHomePage(@ModelAttribute Doctorr d){
		ddao.signupDoctor(d);
		return "doctor";
	}
	
}
