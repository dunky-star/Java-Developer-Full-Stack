<%@ page import="java.util.*" %>
     
    <html>
     
    <body>
     
    <!-- Step 1: Create HTML form -->
    <form action="todo-list.jsp">
    	Add new item: <input type="text" name="theItem" />
    	
    	<input type="submit" value="Submit" />
    </form>
     
    <!-- Step 2: Add new item to "To Do" list -->
    <%
    	// get the TO DO items from the session
    	List<String> items = (List<String>) session.getAttribute("myToDoList");
     
    	// if the TO DO items doesn't exist, then create a new one
    	if (items == null) {
    		items = new ArrayList<String>();
    		session.setAttribute("myToDoList", items);
    	}
    	
    	// see if there is form data to add    	
    	String theItem = request.getParameter("theItem");
    	
    	 
    	// booleans and if/then statement
    	boolean isItemNotEmpty = theItem != null && theItem.trim().length() > 0;
    	boolean isItemNotDuplicate = theItem != null && !items.contains(theItem.trim());
    	
    	if (isItemNotEmpty && isItemNotDuplicate) {    		
    		items.add(theItem.trim());    		
    	}
    %>
     
    <!-- Step 3: Display all "To Do" item from session -->
    <hr>
    <b>To List Items:</b> <br/>
     
    <ol>
    <%
    	for (String temp : items) {
    		out.println("<li>" + temp + "</li>");
    	}
    %>
    </ol>
     
    </body>
     
    </html>
