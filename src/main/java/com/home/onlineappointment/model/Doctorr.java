package com.home.onlineappointment.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctorr {
	
		@Id
		@GeneratedValue
		private int did;
		private String fnamed;
		private String lnamed;
		private String genderd;
		private String phoned1;
		private String phoned2;
		private String emaild;
		private String usernamed;
		private String passwordd;
		private String addressd;
		private String imaged;
		private Date dobd;
		private String availableappo;
		private String totalappo;
		private int status;
		private String addpostgrad1;
		private String addpostgrad2;
		private String inst1;
		private String inst2;
		private String nameofdeg;
		private String nameofinst;
		private String medical_liscense;
		private String speciality;
		private String workplace;
		private String workplace_address;
		private String workplace_phone;

		private String experience;
		private String yearobtained;
		
		
		public String getWorkplace_address() {
			return workplace_address;
		}
		public void setWorkplace_address(String workplace_address) {
			this.workplace_address = workplace_address;
		}
		public String getWorkplace_phone() {
			return workplace_phone;
		}
		public void setWorkplace_phone(String workplace_phone) {
			this.workplace_phone = workplace_phone;
		}
		public String getExperience() {
			return experience;
		}
		public void setExperience(String experience) {
			this.experience = experience;
		}
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public String getFnamed() {
			return fnamed;
		}
		public void setFnamed(String fnamed) {
			this.fnamed = fnamed;
		}
		public String getLnamed() {
			return lnamed;
		}
		public void setLnamed(String lnamed) {
			this.lnamed = lnamed;
		}
		public String getGenderd() {
			return genderd;
		}
		public void setGenderd(String genderd) {
			this.genderd = genderd;
		}
		public String getPhoned1() {
			return phoned1;
		}
		public void setPhoned1(String phoned1) {
			this.phoned1 = phoned1;
		}
		public String getPhoned2() {
			return phoned2;
		}
		public void setPhoned2(String phoned2) {
			this.phoned2 = phoned2;
		}
		public String getEmaild() {
			return emaild;
		}
		public void setEmaild(String emaild) {
			this.emaild = emaild;
		}
		public String getUsernamed() {
			return usernamed;
		}
		public void setUsernamed(String usernamed) {
			this.usernamed = usernamed;
		}
		public String getPasswordd() {
			return passwordd;
		}
		public void setPasswordd(String passwordd) {
			this.passwordd = passwordd;
		}
		public String getAddressd() {
			return addressd;
		}
		public void setAddressd(String addressd) {
			this.addressd = addressd;
		}
		public String getImaged() {
			return imaged;
		}
		public void setImaged(String imaged) {
			this.imaged = imaged;
		}
		public Date getDobd() {
			return dobd;
		}
		public void setDobd(Date dobd) {
			this.dobd = dobd;
		}
		public String getAvailableappo() {
			return availableappo;
		}
		public void setAvailableappo(String availableappo) {
			this.availableappo = availableappo;
		}
		public String getTotalappo() {
			return totalappo;
		}
		public void setTotalappo(String totalappo) {
			this.totalappo = totalappo;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getAddpostgrad1() {
			return addpostgrad1;
		}
		public void setAddpostgrad1(String addpostgrad1) {
			this.addpostgrad1 = addpostgrad1;
		}
		public String getAddpostgrad2() {
			return addpostgrad2;
		}
		public void setAddpostgrad2(String addpostgrad2) {
			this.addpostgrad2 = addpostgrad2;
		}
		public String getInst1() {
			return inst1;
		}
		public void setInst1(String inst1) {
			this.inst1 = inst1;
		}
		public String getInst2() {
			return inst2;
		}
		public void setInst2(String inst2) {
			this.inst2 = inst2;
		}
		public String getNameofdeg() {
			return nameofdeg;
		}
		public void setNameofdeg(String nameofdeg) {
			this.nameofdeg = nameofdeg;
		}
		public String getNameofinst() {
			return nameofinst;
		}
		public void setNameofinst(String nameofinst) {
			this.nameofinst = nameofinst;
		}
		public String getMedical_liscense() {
			return medical_liscense;
		}
		public void setMedical_liscense(String medical_liscense) {
			this.medical_liscense = medical_liscense;
		}
		public String getSpeciality() {
			return speciality;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public String getWorkplace() {
			return workplace;
		}
		public void setWorkplace(String workplace) {
			this.workplace = workplace;
		}
		public String getYearobtained() {
			return yearobtained;
		}
		public void setYearobtained(String yearobtained) {
			this.yearobtained = yearobtained;
		}
		
		
		
	
}
