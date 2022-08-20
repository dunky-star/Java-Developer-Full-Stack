<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<p align = "center">
<c:set var="stuff" value="<%= new java.util.Date() %>" />
Last updated at ${stuff}
</p>