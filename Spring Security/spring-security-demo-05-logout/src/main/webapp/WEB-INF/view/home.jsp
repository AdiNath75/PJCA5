<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Nath IT Solutions Company </title>
</head>

<body>
	<h2>Nath IT Solutions Company Home Page</h2>
	<hr>
	<p>
	Welcome to the nath it solutions company home page
	</p>
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath }/logout"
				method="POST">
				
		<input type="submit" value="Logout" />
		
	</form:form>
</body>

</html>