<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

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
	
	<hr>
	<!-- display user name and roles -->
	
	<p>
		User: <security:authentication property="principal.username"/>
		<br><br>
		Role(s): <security:authentication property="principal.authorities"/>
	</p>
	
	
	<security:authorize access = "hasRole('MANAGER')">
	<hr>
	<!-- Add a link to point to/leaders...this is for the managers -->
	<p>
		<a href="${pageContext.request.contextPath }/leaders">LeaderShip Meeting</a>
		(Only for manager peeps)
	</p>
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
	<hr>
	<!-- Add a link to point to /systems... this is for admins -->
	<p>
		<a href="${pageContext.request.contextPath }/systems">IT systems Meeting</a>
		(Only for Admin peeps)
	</p>
	
	</security:authorize>
	<hr>
	
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath }/logout"
				method="POST">
				
		<input type="submit" value="Logout" />
		
	</form:form>
</body>

</html>