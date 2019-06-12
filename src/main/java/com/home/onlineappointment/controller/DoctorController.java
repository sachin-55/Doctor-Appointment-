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

import com.home.onlineappointment.dao.AppointmentDao;
import com.home.onlineappointment.dao.PatientDao;
import com.home.onlineappointment.model.Appointmentt;
import com.home.onlineappointment.model.Doctorr;
import com.home.onlineappointment.model.Patientt;

@Controller
public class DoctorController {

	@Autowired
	private AppointmentDao appdao;
	
	@Autowired
	private PatientDao pdao;
	
	@RequestMapping(value="/patientview", method=RequestMethod.POST)
	public String patientDetailsViewPage(@ModelAttribute Appointmentt appo, Patientt pat,Model model ){
		
		Appointmentt ap = appdao.getInfo(appo.getAppid());
		model.addAttribute("appoinfo", ap);
		model.addAttribute("age", appo.getApfrom());
		
		Patientt pa = pdao.getInfo(pat.getPid());
		model.addAttribute("patinfo", pa);
		
		return "doctorpatientview";
	}
	
	@RequestMapping(value="/accept-request", method=RequestMethod.POST)
	public String acceptPatient(@ModelAttribute Appointmentt appo,Doctorr doc,Patientt pat,Model model){
		appdao.updateStatus(appo);
		
		
		List<Patientt> plist = new ArrayList<Patientt>();
		List<Period> perlist = new ArrayList<Period>();
		List<Appointmentt> alist= appdao.findDoctor(doc.getDid());
		
		for(Appointmentt item:alist){
			Patientt p=pdao.getInfo(item.getApfrom());
			plist.add(p);
			
			
			LocalDate today = LocalDate.now();
			Date dat = p.getDobp();
			
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		    String strDate = formatter.format(dat);  
//		    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
			
		    String[] date = strDate.split("/");
		    
			LocalDate birthday=LocalDate.of(Integer.valueOf(date[2]),Integer.valueOf(date[0]) ,Integer.valueOf( date[1]));
			
			
			
			Period per= Period.between(birthday,today);
			perlist.add(per);

			}

		model.addAttribute("alist",alist);
		model.addAttribute("plist",plist);
		model.addAttribute("period",perlist);
		
		return "doctorhomepage";
	}
	
	@RequestMapping(value="/change-information", method=RequestMethod.POST)
	public String changeDateTimePage(@ModelAttribute Appointmentt appo, Patientt pat,Model model){
		Appointmentt ap = appdao.getInfo(appo.getAppid());
		model.addAttribute("appoinfo", ap);
		model.addAttribute("age", appo.getApfrom());
		
		Patientt pa = pdao.getInfo(pat.getPid());
		model.addAttribute("patinfo", pa);
		
		
		return "changedatetime";
	}
	@RequestMapping(value="/update-information", method=RequestMethod.POST)
	public String changeDateTime(@ModelAttribute Appointmentt appo, Patientt pat,Model model){

		appdao.updateDate(appo);
		
		Appointmentt ap = appdao.getInfo(appo.getAppid());
		model.addAttribute("appoinfo", ap);
		model.addAttribute("age", appo.getApfrom());
		
		Patientt pa = pdao.getInfo(pat.getPid());
		model.addAttribute("patinfo", pa);
		
		return "doctorpatientview";
	}
	
	
	@RequestMapping(value="/doctor-home", method=RequestMethod.GET)
	public String gotoDoctorHome(Model model, HttpSession session){
			List<Patientt> plist = new ArrayList<Patientt>();
			List<Period> perlist = new ArrayList<Period>();
			
					
				
				
				int idd=(Integer) session.getAttribute("did");
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
		
		
	}
	
	@RequestMapping(value="/doctor-patient", method=RequestMethod.GET)
	public String gotoDoctorPatient(){
		
		return "doctorpatientlist";
	}
	
	@RequestMapping(value="/update-doctor-profile", method=RequestMethod.GET)
	public String gotoDoctorProfile(){
		
		return "updatedoctorprofile";
	}
}
