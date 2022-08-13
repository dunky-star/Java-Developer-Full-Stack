<%@ page import="com.dunky.jsp.*" %>

<html>
<body>
<h3>Hello World of Java!</h3>
<br></br>
The time on the server is <%= new java.util.Date() %>
<br></br>
Let's have some fun: <%= FunUtils.makeItLower("Coding is Fun") %>
<br></br>
<% 
for(int i = 0; i < 5; i++){
out.println("<br><br/> I really love to code " + i);
}
%>
</body>
</html>