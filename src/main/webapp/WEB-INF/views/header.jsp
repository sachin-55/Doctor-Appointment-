<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/css/main.css" var="mainCss"/>
<link href="${mainCss}" rel="stylesheet"/>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Appointment</title>
</head>
<body>
	<div id="header-container">
		<h1 id="header">Online Appointment</h1>	
	</div>
	<div id="body-container">
		<div id="nav-bar">
		<a href="home"><div class="nav-button">Home	</div></a>
		<a href="doctor"><div class="nav-button">Doctor</div></a>	
		<a href="patient"><div class="nav-button">Patient</div></a>
		<a href="admin" ><div class="nav-button" id="adminbtn" >Admin</div></a>
	
		</div>
		