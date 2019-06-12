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
			<div class="doctor-patientlist">
				<div class="patient-info">
					
					<div>Patient Information:</div>
					<div>
						<br>Name:<span class="name"> ${patinfo.fnamep } ${patinfo.lnamep } </span>
						<br><br>Gender:<span class="name">${patinfo.genderp }</span>
						<br><br>Age:${age}
						<br><br>Address:<span class="name">${patinfo.addressp }</span>
						<br><br>Phone:${patinfo.phonep1 }
						<br><br>Alternate Ph:${patinfo.phonep2 }
						<br><br>Email:${patinfo.emailp }
					</div>
					<div>
						<br>Appointment Information
					</div>
					<div>	
						<br>Problem:${appoinfo.problem }
						<br><br>Date:<c:if test="${appoinfo.grantdate ==null }">${appoinfo.reqdate }</c:if>
									<c:if test="${appoinfo.grantdate !=null }">${appoinfo.grantdate }</c:if>
						<br><br>Time:${appoinfo.apptime }
						
						<form action="change-information" method="post" >
							<input type="hidden" name="apfrom" value="${age}">
							<input type="hidden" name="pid" value="${patinfo.pid }">
							<input type="hidden" name="appid" value="${appoinfo.appid }">
							<input type="submit" value="Change Date/Time">
						</form>
						
						<form action="accept-request" method="post">
							<input type="hidden" name="did" value="${did }">
							<input type="hidden" name="pid" value="${patinfo.pid }">
							<input type="hidden" name="appid" value="${appoinfo.appid }">
							Hospital:<input type="text" name="hospital" required >
							<input type="submit" value="Accept">
						</form>
					</div>


				</div>
			</div>



		</div>

	</div>

</body>
</html>

