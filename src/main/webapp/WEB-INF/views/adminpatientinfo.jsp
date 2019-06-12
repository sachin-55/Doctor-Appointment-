<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<spring:url value="/resources/css/admincss.css" var="adminCss" />
<link href="${adminCss}" rel="stylesheet" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OA:Admin</title>
</head>
<body>

	<div id="adminHeader">
		<div id="online">Online Doctor Appointment</div>
		<div id="admin_portal">Admin Portal</div>
		<label class="adminheader">${firstname } ${lastname }</label><br>
		<div id="user">
			Username: <label id="usernam">${username }</label>
		</div>
	</div>
	<hr>
	<div id="adminContainer">
		<div id="adminNav">
			<a  href="adminhomebtn" >
				<div class="nav-btn" >Home</div>
			</a>
			<a class="doctor"  href="admindoctor">
				<div class="nav-btn" >Doctor</div>
			</a>
			<a href="adminpatient">
				<div class="nav-btn">Patient</div>
			</a>
			<a href="adminlogout">
				<div id="logout">Logout</div>
			</a>
		</div>
		<div id="adminBody">
			<div id="table">
					<div id="label">Patient List	</div>
				<table>
					<tr>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Address</th>
						<th>PhoneNumber</th>
						<th>Alternate PhNo.</th>
						<th>Gender</th>
						<th>Email</th>
					</tr>
					<c:forEach var="pat" items="${plist}">
					
							<tr class="table-row">
								<td>${pat.fnamep }</td>
								<td>${pat.lnamep }</td>
								<td>${pat.addressp }</td>
								<td>${pat.phonep1 }</td>
								<td>${pat.phonep2 }</td>
								<td>${pat.genderp }</td>
								<td id="emailt">${pat.emailp }</td>


							</tr>

					</c:forEach>
				</table>
			</div>
			

		</div>

	</div>



</body>
</html>

