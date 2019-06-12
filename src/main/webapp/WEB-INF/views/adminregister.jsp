<%@include file="header.jsp"%>
<div class="content-container">

	<div class="signupform">
		<div>
			If you are already Registered <a href="admin">Click Here</a>
		</div>
		<div id="signupform">
			<br>
			<label>Admin Registration</label>
			<hr>
			<form action="registeradmin" method="post">
				<fieldset>
					<legend>Personal Information</legend>
							Name:<input type="text" name="fname" placeholder="First Name">
								<input type="text" name="lname" placeholder="Last Name"><br>
					<br> Address:<input type="text" name="address" placeholder="Address"><br> 
					<br> Phone:<input type="text" name="phone1" placeholder="Phone"> 
								<input type="text" name="phone2" placeholder="Additional Phone"><br>
					<br> Date of Birth:<input type="date" name="dob" placeholder="Date" required><br> 
					<br> Gender:<select	name="gender">
						<option value="male">Male</option>
						<option value="female">Female</option>
					</select><br> 
					<br> Email:<input type="text" name="email" placeholder="E-mail"><br> 
					<br> Username:<input type="text" name="username" placeholder="Username"><br>
					<br> Password:<input type="password" name="password" placeholder="Password"><br> \
					<br> Upload Image:<input type="file" name="image"><br> 
					<br>

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
