<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Context Example</title>
</head>
<body>
<h2>Page Context Example</h2>
<% pageContext.setAttribute("course","JSP",pageContext.PAGE_SCOPE);
String name = (String)pageContext.getAttribute("course");
out.println("Course name is " +name);%>

</body>
</html>