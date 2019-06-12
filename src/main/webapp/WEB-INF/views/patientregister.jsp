<%@include file="header.jsp"%>
<div class="content-container">

	<div class="signupform">
		<div>
			If you are already Registered <a href="patient">Click Here</a>
		</div>
		<div id="signupform">
			<br>
			<label>Patient Registration</label>
			<hr>
			<form action="registerpatient" method="POST">
				<fieldset>
					<legend>Personal Information</legend>
							Name:<input type="text" name="fnamep" placeholder="First Name">
								<input type="text" name="lnamep" placeholder="Last Name"><br>
					<br> Address:<input type="text" name="addressp" placeholder="Address"><br> 
					<br> Phone:<input type="text" name="phonep1" placeholder="Phone"> 
								<input type="text" name="phonep2" placeholder="Additional Phone"><br>
					<br> Date of Birth:<input type="Date" name="dobp" required><br> 
					<br> Gender:<select	name="genderp">
						<option value="male">Male</option>
						<option value="female">Female</option>
					</select><br> 
					<br> Email:<input type="text" name="emailp" placeholder="E-mail"><br> 
					<br> Username:<input type="text" name="usernamep" placeholder="Username"><br>
					<br> Password:<input type="password" name="passwordp" placeholder="Password"><br>
					<br> Upload Image:<input type="file" name="imagep"><br> <br>

				</fieldset>
			
				<br>&nbsp; 
				<div class="btnSignup">
					<input type="submit" value="Signup">
				</div>

			</form>
		</div>
	</div>


</div>


<%@include file="footer.jsp"%>
