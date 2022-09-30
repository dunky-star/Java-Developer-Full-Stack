<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
	<style>
		.error {color:red}
	</style>
</head>

<body>
	<i>Fill out the form. Asterisk(*) means required.</i>

	<form:form action="processForm" modelAttribute="student">
	
		First name (*): <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		
		<br><br>
	
		Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		
		<br><br>
	
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				
		<br><br>

		Favorite Language:
		
		<form:radiobuttons path="favoriteLanguage" 
		items="${student.favoriteLanguageOptions}"  />

		<br><br>
				
		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>

</body>

</html>












