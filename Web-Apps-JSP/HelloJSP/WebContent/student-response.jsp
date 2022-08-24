<%@ page import="java.util.*" %>
<%@ page import="java.net.URLEncoder" %>

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
	<!-- Cookie mechanism -->
	<%
	String favLang = request.getParameter("favProgrammingLanguage");
	// Encode cookie data ... handle case of languages with spaces in them
    favLang = URLEncoder.encode(favLang, "UTF-8");
	// Create Cookie
	Cookie theCookie = new Cookie("myApp.favProgrammingLanguage", favLang);
	// Set life span... the total number of seconds
	theCookie.setMaxAge(60*60*24*365);
	// Send Cookie to the browser
	response.addCookie(theCookie);
	%>
	<br></br>
	Thanks, we set your favorite language to: ${param.favProgrammingLanguage}
	<br></br>
	<a href="homepage-i18n.jsp">Show personalized home page</a>
	
</body>
</html>