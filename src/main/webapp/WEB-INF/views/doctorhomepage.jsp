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
			<a href="doctor-home"><div class="nav-btn">Home</div></a> <a href="doctor-patient"><div
					class="nav-btn">Patient</div></a> <a href="update-doctor-profile"><div class="nav-btn"
					id="up-profile">Update Profile</div></a>
		</div>
		<div id="content-container">
			<div class="doctor-patientlist">
				<div class="patient-info">
					<table>
						<tr>
							<th>Patient Name</th>
							<th>Gender</th>
							<th>Age</th>
							<th>Problem</th>
						</tr>
						<c:forEach var="appo" items="${plist}" varStatus="status">
						
						<tr>
								<td><span class="name">${appo.fnamep} ${appo.lnamep }</span></td>


							<td><span class="name">${appo.genderp }</span></td>

							<td>${period[status.index].getYears() } </td>
							<td>${alist[status.index].problem }</td>
							<td>
								<form action="patientview" method="post">
									<input type="hidden" name="apfrom" value="${period[status.index].getYears() }">
									<input type="hidden" name="pid" value="${appo.pid }">
									<input type="hidden" name="appid" value="${alist[status.index].appid }">
									<input type="submit" value="View">
								</form>
							
							</td>

						</tr>
							</c:forEach>
					</table>


				</div>
			</div>



		</div>

	</div>

</body>
</html>

