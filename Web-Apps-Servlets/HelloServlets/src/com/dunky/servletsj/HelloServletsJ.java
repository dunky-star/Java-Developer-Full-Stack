package com.dunky.servletsj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServletsJ
 */
@WebServlet("/HelloServletsJ")
public class HelloServletsJ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServletsJ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		       // Step 1: set the content type
				response.setContentType("text/html");
				
				// Step 2: get the printwriter
				PrintWriter out = response.getWriter();
				
				// Step 3: generate HTML content
				out.println("<html><body>");
				
				out.println("<h2>Hello World of Java!</h2>");
				out.println("<hr>");
				out.println("Time on the server is: " + new java.util.Date());
				
				out.println("</body></html>");
		
	}

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
