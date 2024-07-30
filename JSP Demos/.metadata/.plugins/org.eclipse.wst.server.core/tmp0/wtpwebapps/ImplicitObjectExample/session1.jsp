<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>session object</title>
</head>
<body>
<% session.setAttribute("user","admin"); %>
<a href="session2.jsp">Click here to get user name</a>
</body>
</html>