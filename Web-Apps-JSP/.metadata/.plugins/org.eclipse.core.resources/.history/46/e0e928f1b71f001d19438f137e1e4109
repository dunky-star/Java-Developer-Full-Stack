<html>
<head>
<title>Student Confirmation Title</title>
</head>
<body>
	The student is confirmed: ${param.firstName} ${param.lastName}
	<br></br> The student's country: ${param.country}
	<br></br> Favorite progrmming language: ${param.favProgrammingLanguage}
	<br></br>
	<!-- Display list of favorite games -->
	The Favorite sports is/are:
	<ul>
		<%
		String[] langs = request.getParameterValues("favoriteGames");
		if (langs != null) {
		  for (String tempLangs : langs){
			  out.println("<li>" + tempLangs + "</li>");
		  }
		}
		%>
	</ul>
</body>
</html>