package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username =request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		if("admin".equals(Username) && "1234".equals(password)) {
			pw.println("<html><body>");
			pw.println("<h2> welcome,"+Username+"<h2>");
			pw.println("<body></html>");
		}
		else {
			pw.println("<html><body>");
			pw.println("<h2> Invalid,<h2>");
			pw.println("<body></html>");
		}
	}

}
