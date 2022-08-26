package com.dunky.mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcStudentServletJ
 */
@WebServlet("/MvcStudentServletJ")
public class MvcStudentServletJ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcStudentServletJ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step 1: Get the student data from helper class (model).
		List<Student> students = StudentDataUtil.getStudents();
		
		
		// Step 2: Add students to request object
		request.setAttribute("student_list",  students);
		
		// Step 3: Get request dispatcher
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("view_students.jsp");
		
		// Step 4: Now, forward to JSP
		dispatcher.forward(request, response);
		
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
