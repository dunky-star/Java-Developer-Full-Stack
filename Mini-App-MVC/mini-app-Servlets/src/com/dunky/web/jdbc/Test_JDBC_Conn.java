package com.dunky.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/Test_JDBC_Conn")
public class Test_JDBC_Conn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Define datasource/connection pool for Resource Injection
	@Resource(name="jdbc/web_student_j")
	private DataSource dataSource;
	
	
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
		ResultSet myResultSet = null;
		
		try {
			myConn = dataSource.getConnection();
			
			// Step 3:  Create a SQL statements
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			// Step 4:  Execute SQL query
			myResultSet = myStmt.executeQuery(sql);
			
			// Step 5:  Process the result set
			while (myResultSet.next()) {
				String last_name = myResultSet.getString("last_name");
				out.println(last_name);
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}finally {
			// close JDBC objects
			close(myConn, myStmt, myResultSet);
		}
	}


	private void close(Connection myConn, Statement myStmt, ResultSet myResultSet) {
		
		try {
			if (myResultSet != null) {
				myResultSet.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();   // doesn't really close it ... just puts back in connection pool
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}

}