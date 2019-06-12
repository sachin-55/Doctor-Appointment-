<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<spring:url value="/resources/css/patientcss.css" var="patientCss" />
<link href="${patientCss}" rel="stylesheet" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OP:Patient</title>
</head>
<body>

	<div id="patientHeader">
		<div id="online">Online Doctor Appointment</div>
		<div class="patient-name">:: ${firstname } ${lastname }</div>
		<div id="user">
			Username: <label id="usernam">${username }</label><br> <a
				href="patientlogout"><div id="logout">Logout</div></a>
		</div>
	</div>
	<div id="patientContainer">
		<div id="nav-bar">
			<a href="patienthome"><div class="nav-btn">Home</div></a> <a href="#"><div
					class="nav-btn">Doctor</div></a> <a href="#"><div class="nav-btn"
					id="up-profile">Update Profile</div></a>
		</div>
		<div class="content-container">
			<div class="doctor-list">
				<table class="doctor-appoint-list">
					<tr>
						<th>Name of Doctor</th>
						<th>Speciality</th>
						<th>Action</th>
					</tr>
					<c:forEach var="doc" items="${dlist}">
						<c:if test="${doc.status ==1}">
							<tr>
								<td>${doc.fnamed }
									${doc.lnamed }</td>
								<td>${doc.speciality }</td>
								<td><form action="appointment" method="post">
										<input type="hidden" name="apfrom" value=${userid }>
										<input type="hidden" name="apto" value=${doc.did }>
										<input type="submit" value="Get Appointment">
									</form></td>
							</tr>

						</c:if>
					</c:forEach>




				</table>

			</div>
		</div>

	</div>

</body>
</html>

