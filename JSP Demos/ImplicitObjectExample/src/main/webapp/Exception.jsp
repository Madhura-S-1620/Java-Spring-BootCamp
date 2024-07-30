<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exception Example</title>
</head>
<body>
  
  <%
    int x = 5, y = 0;
    try {
        out.println(x / y);
    } catch (ArithmeticException e) {
        out.println("Error: Division by zero is not allowed.");
    }
%>
  
  
</body>
</html>