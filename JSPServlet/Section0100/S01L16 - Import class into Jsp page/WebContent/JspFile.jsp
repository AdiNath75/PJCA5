<%@ page import="java.util.Date,org.nath.UserDefined"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp File</title>
</head>
<body>
	<%=new Date()%>
	<br />
	<% 		out.print(new UserDefined().Demo()); 	%>
</body>
</html>