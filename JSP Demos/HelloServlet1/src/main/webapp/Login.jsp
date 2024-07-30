<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;"><title>Request Object Form</title>
</head>
<body>
<% String username=request.getParameter("username");
out.println("Welcome "+username);
%>
 <br>
<% int var1=10;int var2=20;
out.println("var1 is " +var1);
out.println("var2 is "+var2); 
%>
<br>
<%response.setContentType("text/html"); %>


</body>
</html>