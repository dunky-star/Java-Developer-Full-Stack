<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Redirect to Servlet</title>
</head>
<body>
<%
    response.sendRedirect(request.getContextPath() + "/StudentServlet");
%>
</body>
</html>