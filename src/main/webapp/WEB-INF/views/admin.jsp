<%@include file="header.jsp"%>
<div class="content-container">
	<div class="loginform">
		<p class="error">${error }</p>
								<img alt="img" class="center" src="resources/background-image/600_97d118b7a6f8f87d18f7b1385ea7665e.png	">
		
	
		<form action="adminhome" method="post">
			<fieldset>
				<legend>Login:Admin</legend>
				<input type="text" name="username" placeholder="Username or Email">
				<br><br><input type="password" name="password" placeholder="Password">
						<br><input type="submit" value="Login">
			</fieldset>
<!-- 							<input type="hidden" name="aid"> -->
			
		</form>
				<div>If you are not Registered <a href="register_admin">Click Here</a></div>
		
	</div>
	
	
</div> 


<%@include file="footer.jsp"%>
