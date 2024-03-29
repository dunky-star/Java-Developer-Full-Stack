package com.dunky.servletsj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step 1: Set content type
		response.setContentType("text/html");
		
		// Step 2: Get print Writer
		PrintWriter out = response.getWriter();
		
		// Step 3: read configuration params
		ServletContext context = getServletContext(); // inherit from HttpServlet
		
		String maxCartSize = context.getInitParameter("max-shopping-cart-size");
		String teamName = context.getInitParameter("project-team-name");
		
		// Step 4: Generate the HTML content
		out.println("<html><body>");
		
		out.println("The student is confirmed: " 
				+ request.getParameter("firstName") + " "
				+ request.getParameter("lastName"));
		
		out.println("<br/><br/>");
		out.println("Max cart: " + maxCartSize);
		out.println("<br/><br/>");
		out.println("Team name: " + teamName);
		
		out.println("<br></br><a href=\"student-form.html\">Go back to home page</a>");
		
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
