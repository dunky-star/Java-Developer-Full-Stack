<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Student's Detail</title>
</head>
<body>



	<c:forEach var="tempStudent" items="${student_list}">
	
		${tempStudent} <br/>
	
	</c:forEach>


</body>
</html>