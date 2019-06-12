<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<spring:url value="/resources/css/doctorcss.css" var="doctorCss" />
<link href="${doctorCss}" rel="stylesheet" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OD:Doctor</title>
</head>
<body>

	<div id="doctorHeader">
		<div id="online">Online Doctor Appointment</div>
		<div class="doctor-name">:: ${firstname } ${lastname }</div>
		<div id="user">
			Username: <label id="usernam">${username }</label><br> <a
				href="doctorlogout"><div id="logout">Logout</div></a>
		</div>
	</div>
	<div id="doctorContainer">
		<div id="nav-bar">
			<a href="#"><div class="nav-btn">Home</div></a> <a href="#"><div
					class="nav-btn">Patient</div></a> <a href="#"><div class="nav-btn"
					id="up-profile">Update Profile</div></a>
		</div>
		<div id="content-container">
			<div>
			Patient Requested <br>
			Date:${appoinfo.reqdate }<br><br>
			Time:${appoinfo.apptime }<br>
			<br><br>
			Change Date and Time<br>
				<form action="update-information" method="post">
					<input type="hidden" name="appid" value="${appoinfo.appid }">
					<br>Date:<input type="date" name="grantdate" required>
					<br>
					<br>Appointment Time: <Select name="apptime" >
						<option value="0">--Select--</option>
						<option value="6am">6:00 AM</option>
						<option value="6-30am">6:30 AM</option>
						<option value="7am">7:00 AM</option>
						<option value="7-30am">7:30 AM</option>
						<option value="8am">8:00 AM</option>
						<option value="8-30am">8:30 AM</option>
						<option value="9am">9:00 AM</option>
						<option value="9-30am">9:30 AM</option>
						<option value="10am">10:00 AM</option>
						<option value="10-30am">10:30 AM</option>
						<option value="11am">11:00 AM</option>
						<option value="11-30am">11:30 AM</option>
						<option value="12am">12:00 AM</option>
						<option value="12-30am">12:30 AM</option>
						<option value="1pm">1:00 PM</option>
						<option value="1-30pm">1:30 PM</option>
						<option value="2pm">2:00 PM</option>
						<option value="2-30pm">2:30 PM</option>
						<option value="3pm">3:00 PM</option>
						<option value="3-30pm">3:30 PM</option>
						<option value="4pm">4:00 PM</option>
						<option value="4-30pm">4:30 PM</option>
						<option value="5pm">5:00 PM</option>
						<option value="5-30pm">5:30 PM</option>
						<option value="6pm">6:00 PM</option>
						<option value="6-30pm">6:30 PM</option>

					</Select> 
					<input type="hidden" name="apfrom" value="${age}"> 
					<input type="hidden" name="pid" value="${patinfo.pid }"> 
					<input type="hidden" name="appid" value="${appoinfo.appid }"> <br>
					<br>
					<input type="submit" value="Change">
				</form>
				
			</div>



		</div>

	</div>

</body>
</html>

