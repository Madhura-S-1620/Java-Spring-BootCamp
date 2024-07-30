<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Config Object Example</title>
</head>
<body>
<h2>Config Object Example</h2>
<% String servletName = config.getServletName();
out.println("Servlet Name is " + servletName);%>

</body>
</html>