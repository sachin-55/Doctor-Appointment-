package com.home.onlineappointment.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.onlineappointment.dao.AdminDao;
import com.home.onlineappointment.dao.AppointmentDao;
import com.home.onlineappointment.dao.DoctorDao;
import com.home.onlineappointment.dao.PatientDao;
import com.home.onlineappointment.model.Adminn;
import com.home.onlineappointment.model.Appointmentt;
import com.home.onlineappointment.model.Doctorr;
import com.home.onlineappointment.model.Patientt;


@Controller
public class LoginController {

	@Autowired
	private DoctorDao ddao;
	
	@Autowired
	private AdminDao adao;
	
	@Autowired
	private PatientDao pdao;
	
	@Autowired
	private AppointmentDao appdao;
	
	@RequestMapping(value="/doctorhome", method=RequestMethod.POST)
	public String gotoDoctorHome(@ModelAttribute Doctorr d, Model model, HttpSession session){
			Doctorr dr=ddao.verifyDoctor(d.getUsernamed(), d.getPasswordd());
			List<Patientt> plist = new ArrayList<Patientt>();
			List<Period> perlist = new ArrayList<Period>();
			
		if(dr!=null){
			if(dr.getStatus()==1){
//				model.addAttribute("username", dr.getUsernamed());
//				model.addAttribute("firstname", dr.getFnamed());
//				model.addAttribute("lastname", dr.getLnamed());
				
				session.setAttribute("did",dr.getDid());
				session.setAttribute("username", dr.getUsernamed());
				session.setAttribute("firstname", dr.getFnamed());
				session.setAttribute("lastname", dr.getLnamed());
				
				int idd=dr.getDid();
				List<Appointmentt> alist= appdao.findDoctor(idd);
				for(Appointmentt item:alist){
					Patientt p=pdao.getInfo(item.getApfrom());
					plist.add(p);
					
					
					LocalDate today = LocalDate.now();
					Date dat = p.getDobp();
					
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
				    String strDate = formatter.format(dat);  
//				    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
					
				    String[] date = strDate.split("/");
				    
					LocalDate birthday=LocalDate.of(Integer.valueOf(date[2]),Integer.valueOf(date[0]) ,Integer.valueOf( date[1]));
					
					
					
					Period per= Period.between(birthday,today);
					perlist.add(per);

					}
				
				
				model.addAttribute("alist",alist);
				model.addAttribute("plist",plist);
				model.addAttribute("period",perlist);

				return "doctorhomepage";
			}else{
				model.addAttribute("error","Account not activated");

				return "doctor";
			}
		
		}else{
			model.addAttribute("error","Username/Email or Password is invalid");
			return "doctor";
		}
		
	}
	@RequestMapping(value="/patienthome", method=RequestMethod.POST)
	public String gotoPatientHome(@ModelAttribute Patientt p, Model model,HttpSession session){
		Patientt pat = pdao.verifyPatient(p.getUsernamep(),p.getPasswordp());
		
		if(pat!=null){
			session.setAttribute("userid", pat.getPid());
			session.setAttribute("username", pat.getUsernamep());
			session.setAttribute("firstname",pat.getFnamep());
			session.setAttribute("lastname", pat.getLnamep());
			
			model.addAttribute("dlist",ddao.getAll());
			
			return "patienthomepage";
		}else{
			model.addAttribute("error","Username/Email or Password is invalid");
			return "patient";
		}
		
		
	}
	@RequestMapping(value="/adminhome", method=RequestMethod.POST)
	public String gotoAdminHome(@ModelAttribute Adminn a, Model model,HttpSession session){
		Adminn admin=adao.verifyAdmin(a.getUsername(), a.getPassword());
		
		if(admin==null){
			model.addAttribute("error","Username/Email or Password is invalid");
			return "admin";
		}
		else{
			
//			model.addAttribute("username", admin.getUsername());
//			model.addAttribute("firstname", admin.getFname());
//			model.addAttribute("lastname", admin.getLname());
			session.setAttribute("username", admin.getUsername());
			session.setAttribute("firstname", admin.getFname());
			session.setAttribute("lastname", admin.getLname());
			session.setMaxInactiveInterval(500);
			
			model.addAttribute("plist",pdao.getAll());
			model.addAttribute("dlist",ddao.getAll());
			
			return "adminhomepage";
		}
	
		
	}
	
	
	
}
