package com.dunky.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class test_servlet
 */
@WebServlet("/test_servlet")
public class test_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    
	// Step 0: Define datasource/connection pool for Resource Injection
	
	@Resource(name="jdbc/web_student_j")
	private DataSource dataSource;

    /**
     * Default constructor. 
     */
    public test_servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Step 1:  Set up the printwriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");	
		
		// Step 2:  Get a connection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet MyRs = null;
		
		try {
			
			myConn = dataSource.getConnection();
			
			// Step 3: Create a SQL statements
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			// Step 4: Execute SQL query
			MyRs = myStmt.executeQuery(sql);
			
			// Step 5: Process the result set
			while (MyRs.next()) {
				String last_name = MyRs.getString("last_name");
				out.println(last_name);
			}
		}
		
	} catch (Exception exc) {
		exc.printStackTrace();
	}

}
