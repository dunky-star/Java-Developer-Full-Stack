<%@ page import="com.dunky.jsp.*" %>

<html>
<body>
<jsp:include page="my-header.html" />

<h2>Hello World of Java!</h2>
<h3>JSP built-in objects</h3>
<br></br>
Request user agent: <%= request.getHeader("User-Agent") %>
<br></br>
Request language: <%= request.getLocale() %>
<br></br>

Let's have some fun: <%= FunUtils.makeItLower("<b>Coding is Fun</b>") %>
<br></br>
<% 
for(int i = 0; i < 5; i++){
out.println("<br><br/> I really love to code " + i);
}
%>

<jsp:include page="my-footer.jsp" />
</body>
</html>