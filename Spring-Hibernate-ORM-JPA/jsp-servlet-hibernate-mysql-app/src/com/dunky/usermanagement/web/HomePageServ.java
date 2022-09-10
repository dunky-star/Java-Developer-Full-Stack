package com.dunky.usermanagement.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dunky.usermanagement.dao.UserDBUtil;
import com.dunky.usermanagement.model.User;

/**
 * HomePageServ.java Controller Servlet
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * @email Geoffrey Duncan Opiyo
 */

@WebServlet("/")
public class HomePageServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDBUtil userDBUtil;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageServ() {
    	userDBUtil = new UserDBUtil();
    }
    
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        doGet(request, response);
	}
	  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String action = request.getServletPath();
		 
		 try {
	            switch (action) {
	                case "/new":
	                    showNewForm(request, response);
	                    break;
	                case "/insert":
	                    insertUser(request, response);
	                    break;
	                case "/delete":
	                    deleteUser(request, response);
	                    break;
	                case "/edit":
	                    showEditForm(request, response);
	                    break;
	                case "/update":
	                    updateUser(request, response);
	                    break;
	                default:
	                    listUser(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
	        List <User> listUser = userDBUtil.getAllUser();
	        request.setAttribute("listUser", listUser);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
	        dispatcher.forward(request, response);
		
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response)  throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");

        User user = new User(id, name, email, country);
        userDBUtil.updateUser(user);
        response.sendRedirect("list");
		
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        User existingUser = userDBUtil.getUser(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        request.setAttribute("user", existingUser);
        dispatcher.forward(request, response);
		
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        userDBUtil.deleteUser(id);
        response.sendRedirect("list");
		
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User newUser = new User(name, email, country);
        userDBUtil.saveUser(newUser);
        response.sendRedirect("list");
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
		
	}
		

	
}
