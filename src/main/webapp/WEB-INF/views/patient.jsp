<%@include file="header.jsp"%>
<div class="content-container">
	<div class="loginform">
		<p class="error">${error }</p>
						<img alt="img" class="center" src="resources/background-image/Sedera-Doctor-002_with-background-1.png">
	
		<form action="patienthome" method="post">
			<fieldset>
				<legend>Login:Patient</legend>
				<input type="text" name="usernamep" placeholder="Username or Email">
				<br><br><input type="password" name="passwordp" placeholder="Password">
						<br><input type="submit" value="Login">
			
			</fieldset>
		</form>
				<div>If you are not Registered <a href="register_patient">Click Here</a></div>
		
	</div>
	

</div> 


<%@include file="footer.jsp"%>
