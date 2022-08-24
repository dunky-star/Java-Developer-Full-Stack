<%@ page import="com.dunky.jsp.*"%>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<body>
	<jsp:include page="my-header.html" />

	<h2>Hello World of Java!</h2>
	<h3>JSP built-in objects</h3>
	<br></br> Request user agent:
	<%=request.getHeader("User-Agent")%>
	<br></br> Request language:
	<%=request.getLocale()%>
	<br></br>

	<br></br> Let's have some fun:
	<%=FunUtils.makeItLower("<b>Coding is Fun</b>")%>
	<br></br>
	<%
	for (int i = 0; i < 5; i++) {
		out.println("<br><br/> I really love to code " + i);
	}
	%>
    <br></br>
    
    <!-- Create sample data - #ArrayList of student... normally provided by MVC -->
    <% 
     List<Student> dataStudent = new ArrayList<>();
    
     dataStudent.add( new Student("John", "Doe", false));
     dataStudent.add( new Student("Kaligs", "Xcross", false));
     dataStudent.add( new Student("Lamaro", "Arma", true));
     
     pageContext.setAttribute("myStudents", dataStudent);
     %>
     
     <br></br>
     <!-- Displaying student data using JSTL tag forEach-->
     <table border="1">
	    <tr>
		    <th>First Name</th>
		    <th>Last Name</th>
		    <th>Gold Customer</th>
	    </tr>
	     <c:forEach var="tempStudent" items="${myStudents}"> 
	     <tr>
			<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>
				<c:if test="${tempStudent.goldCustomer}">
					Special Discount
				</c:if>
				
				<c:if test="${not tempStudent.goldCustomer}">
					-
				</c:if>
				
			</td> 
		</tr>
	     </c:forEach>
     </table>
     
    <!-- Now show a personalize page ... use the "favLang" variable -->
    <!-- Reading favorite programming language Cookie -->
    <%
    // The default... if there are no Cookies
    String favLang = "Java";
    // Get the Cookies from Browser request
    Cookie[] theCookies = request.getCookies();
    // Find our favorite language cookie
    if(theCookies != null){
    	for (Cookie tempCookie : theCookies){
    		if("myApp.favProgrammingLanguage".equals(tempCookie.getName())){
    			// decode cookie data ... handle case of languages with spaces in them
                favLang = URLDecoder.decode(tempCookie.getValue(), "UTF-8");
    			break;
    		}
    	}
    }
    %>
    <br></br>
    <!-- Show new books for the favorite language -->
    <h4>New Books for <%= favLang %> </h4>
	    <ul>
	      <li>Books Books Books</li>
	      <li>Just a place holder</li>
	    </ul>
    <!-- Show the latest news for the favorite language -->
    <h4>Latest News Report for <%= favLang %> </h4>
    <ul>
	      <%
		    // just create some sample data to demonstrate looping with forEach JSTL ...normally provided by MVC
		    String[] news = {"Kampala Mobile Money", "Kenya pesa", "Philadelphia programmers"};
	
		    pageContext.setAttribute("myNews", news);
	        %>
	        <c:forEach var="tempNews" items="${myNews}">
			
			   <li>${tempNews}</li>
			
		   </c:forEach>
    </ul>
 
    <!-- Show the hot jobs for the favorite language -->
    <h4>Hot Jobs for <%= favLang %> </h4>
	    <ul>
	      <li>Jobs Jobs Jobs</li>
	      <li>Blah Blah Blah</li>
	      <li>Just a place holder</li>
	    </ul>
         
    <br></br>
	<a href="student-form.html">Go to student page</a>
	 <hr>
	<jsp:include page="my-footer.jsp" />
</body>
</html>