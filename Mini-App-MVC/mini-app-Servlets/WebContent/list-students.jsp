<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, com.dunky.web.jdbc.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mini App - Student Records.</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<%
	// get the students from the request object (sent by servlet)
	List<Student> theStudents = (List<Student>) request.getAttribute("STUDENT_LIST");
%>


<body>

<div id="wrapper">
 <div id="header">
    <h2> SimpliLearn University</h2>
 </div>
</div>

<div id="container">
	<div id="content">
		<table>
			<tr>
				<th> First Name </th>
				<th> Last Name </th>
				<th> Email Address </th>
			</tr>
			
			<% for (Student tempStudent: theStudents) { %>
				<tr>
					<td> <%= tempStudent.getFirstName() %></td>
					<td> <%= tempStudent.getLastName() %></td>
					<td> <%= tempStudent.getEmail() %></td>
				</tr>
			<% } %>
			
		</table>
	</div>
</div>

</body>
</html>