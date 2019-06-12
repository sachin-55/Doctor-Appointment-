<%@include file="header.jsp"%>
<div class="content-container">

	<div class="loginform">
	<p class="error">${error }</p>
					<img alt="img" class="center" src="resources/background-image/flat-vector-doctor-6.png">
	
		<form action="doctorhome" method="post" >
			<fieldset>
				<legend>Login:Doctor</legend>
				<input type="text" name="usernamed" placeholder="Username or Email">
				<br><br><input type="password" name="passwordd" placeholder="Password">
						<br><div class="btnLogin"><input type="submit" value="Login"></div>
			
			</fieldset>
		</form>
		<div>If you are not Registered <a href="register_doctor">Click Here</a></div>
		
	</div>


</div>


<%@include file="footer.jsp"%>
