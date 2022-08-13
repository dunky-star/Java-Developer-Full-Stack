<html>

<body>

<h3>Hello World of Java!</h3>

The time on the server is <%= new java.util.Date() %>
<br></br>
Converting a string to upper case: <%= new String("Geoffrey Duncan Opiyo").toUpperCase() %>
<br></br>
<% 
for(int i = 0; i < 5; i++){
out.println("<br><br/> I really love to code " + i);
}
%>

</body>

</html>