<%@include file="header.jsp"%>
<div class="content-container">

	<div class="signupform">
		<div>
			If you are already Registered <a href="doctor">Click Here</a>
		</div>
		<div id="signupform">
			<br>
			<h3>&emsp;Doctor Registration</h3>
			<hr>
			<form action="registerdoctor" method="post">
				<fieldset>
					<legend>Personal Information</legend>
					   	Name:<input type="text" name="fnamed" placeholder="First Name">
								<input type="text" name="lnamed" placeholder="Last Name"><br>
					<br> Address:<input type="text" name="addressd" placeholder="Address"><br> 
					<br> Phone:<input type="text" name="phoned1" placeholder="Phone"> 
								<input type="text" name="phoned2" placeholder="Additional Phone"><br>
					<br> Date of Birth:<input type="date" name="dobd" required><br> 
					<br> Gender:<select	name="genderd">
						<option value="male">Male</option>
						<option value="female">Female</option>
					</select><br> 
					<br> Email:<input type="text" name="emaild" placeholder="E-mail"><br> 
					<br> Username:<input type="text" name="usernamed" placeholder="Username"><br>
					<br> Password:<input type="password" name="passwordd" placeholder="Password"><br>
					<br> Upload Image:<input type="file" name="imaged"><br> <br>

				</fieldset>
				<br>
				<fieldset>
					<legend>Academic Information</legend>
					Name of Degree:<input type="text" name="nameofdeg" placeholder="Name of Degree"><br> <br>
					Institution:<input type="text" name="nameofinst" placeholder="Institution name"><br> <br> 
					Year Obtained:<input type="text" name="yearobtained" placeholder="Year passed"><br> <br> <br>
					Additional Post Graduate(1):<input type="text" name="addpostgrad1" placeholder="Additional postgrad1"><br> <br>
					Institution:<input type="text" name="inst1"	placeholder="Postgrad1 Instution"><br> <br> <br>
					Additional Post Graduate(1):<input type="text" name="addpostgrad2" placeholder="Additional postgrad2"><br> <br>
					Institution:<input type="text" name="inst2" placeholder="Postgrad2 Instution"><br> <br>


				</fieldset>
				<br>
				<fieldset>
					<legend>Professional Information</legend>
					Current Practising Hospital:<input type="text" name="workplace"	placeholder="Hospital Name"><br><br> 
					Hospital Address:<input type="text" name="workplace_address" placeholder="Hospital Address"><br> <br>
					Hospital Phone:<input type="text" name="workplace_phone" placeholder="Hospital Contact number"><br> <br>
					Experience (in years):<input type="text" name="experience" placeholder="Experience"><br> <br>
					Speciality:<select name="speciality">
						<option value="">Choose Speciality</option>

						<option value="Allergy and immunology">Allergy and
							immunology</option>
						<option value="Anesthesiology">Anesthesiology</option>
						<option value="Cardiology (Disease)">Cardiology (Disease)
						</option>
						<option value="Cardiology (Interventional)">Cardiology
							(Interventional)</option>
						<option value="Child and Adolescent Psychiatry">Child and
							Adolescent Psychiatry</option>
						<option value="Chiropractic">Chiropractic</option>
						<option value="Clinical Cardiac Electrophysiology">
							Clinical Cardiac Electrophysiology</option>
						<option value="Colon and Rectal Surgery">Colon and Rectal
							Surgery</option>
						<option value="Diagnostic Radiology">Diagnostic Radiology
						</option>
						<option value="Dermatology">Dermatology</option>
						<option value="Emergency Medicine">Emergency Medicine</option>
						<option value="Endocrinology">Endocrinology</option>
						<option value="Facial Plastic Surgery">Facial Plastic
							Surgery</option>
						<option value="Family Medicine">Family Medicine</option>
						<option value="Family Medicine">Family Medicine</option>
						<option value="Gastroenterology">Gastroenterology</option>
						<option value="General Practice">General Practice</option>
						<option value="General Surgery">General Surgery</option>
						<option value="Geriatric Medicine">Geriatric Medicine</option>
						<option value="Hematology">Hematology</option>
						<option value="Hepatology">Hepatology</option>
						<option value="Hospitalist">Hospitalist</option>
						<option value="Infectious Disease">Infectious Disease</option>
						<option value="Internal Medicine">Internal Medicine</option>
						<option value="Medical Genetics">Medical Genetics</option>
						<option value="Naturopathy">Naturopathy</option>
						<option value="Nephrology">Nephrology</option>
						<option value="Neurology">Neurology</option>
						<option value="Neurosurgeon">Neurosurgeon</option>
						<option value="Nuclear Medicine">Nuclear Medicine</option>
						<option value="Nutritionist">Nutritionist</option>
						<option value="Obstetrics / Gynecology (OBGYN)">
							Obstetrics / Gynecology (OBGYN)</option>
						<option value="Occupational Medicine">Occupational
							Medicine</option>
						<option value="Ophthalmology">Ophthalmology</option>
						<option value="Optometry">Optometry</option>
						<option value="Oncology">Oncology</option>
						<option value="Orthopedic Surgery">Orthopedic Surgery</option>
						<option value="Osteopathic Medicine">Osteopathic Medicine
						</option>
						<option value="Osteopathic Medicine">Osteopathic Medicine
						</option>
						<option value="Otolaryngology / ENT">Otolaryngology / ENT
						</option>
						<option value="Pain Medicine">Pain Medicine</option>
						<option value="Pathology (Anatomic/Clinical)">Pathology
							(Anatomic/Clinical)</option>
						<option value="Pediatrics">Pediatrics</option>
						<option value="Physical Medicine and Rehabilitation">
							Physical Medicine and Rehabilitation</option>
						<option value="Plastic and Reconstructive Surgery">
							Plastic and Reconstructive Surgery</option>
						<option value="Podiatry">Podiatry</option>
						<option value="Primary Care">Primary Care</option>
						<option value="Psychiatry">Psychiatry</option>
						<option value="Psychology">Psychology</option>
						<option value="Pulmonary Disease">Pulmonary Disease</option>
						<option value="Radiology">Radiology</option>
						<option value="Rheumatology">Rheumatology</option>
						<option value="Thoracic Surgery">Thoracic Surgery</option>
						<option value="Transplant Surgery">Transplant Surgery</option>


					</select> <br> 
					<br> Medical Liscense Photo:<input type="file" name="medical_liscense"><br> <br>
					Total Appointment(in a Day):<input type="text" name="totalappo" placeholder="Number of Patient"><br>


				</fieldset>
				<br>&nbsp;
				<div class="btnSignup">
					<input type="submit" value="Signup">
				</div>

			</form>

		</div>

	</div>
	<br> &nbsp;
</div>


<%@include file="footer.jsp"%>
