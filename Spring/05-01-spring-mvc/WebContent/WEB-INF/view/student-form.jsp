<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>

<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	
	<br><br>
	
	Last Name: <form:input path="lastName" />
	
	<br><br>
	
	Country:
	
	<form:select path="country">
	
		<form:options items="${student.countryOptions}" />
		
	</form:select>
	
	<br><br>
	
	Favorite Language:
		<form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}"  />
		
		<br><br>
		
	Operating Systems:
		
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
		mac OS<form:checkbox path="operatingSystems" value="mac OS"/>
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		
		<br><br>
	
	<input type="submit" value="submit" />
	
	</form:form>

</body>
</html>