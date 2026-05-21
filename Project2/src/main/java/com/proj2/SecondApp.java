package com.proj2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class SecondApp extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("texts/html");
		PrintWriter pr = resp.getWriter();
		pr.println("<!DOCTYPE html>");
		pr.println("<html lang='en'>");
		pr.println("<head>");
		pr.println("<meta charset='UTF-8'>");
		pr.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		pr.println("<title>My First Servlet</title>");
		pr.println("<style>");
		pr.println("body {");
		pr.println("  margin: 0;");
		pr.println("  font-family: Arial, sans-serif;");
		pr.println("  background: linear-gradient(135deg, #74ebd5 0%, #ACB6E5 100%);");
		pr.println("  display: flex;");
		pr.println("  justify-content: center;");
		pr.println("  align-items: center;");
		pr.println("  height: 100vh;");
		pr.println("}");
		pr.println(".container {");
		pr.println("  background: white;");
		pr.println("  padding: 40px;");
		pr.println("  border-radius: 12px;");
		pr.println("  box-shadow: 0 8px 20px rgba(0,0,0,0.2);");
		pr.println("  text-align: center;");
		pr.println("}");
		pr.println("h1 {");
		pr.println("  color: #4A90E2;");
		pr.println("  margin-bottom: 20px;");
		pr.println("}");
		pr.println("p {");
		pr.println("  font-size: 18px;");
		pr.println("  color: #333;");
		pr.println("}");
		pr.println("</style>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("<div class='container'>");
		pr.println("<h1>Hello World !!!</h1>");
		pr.println("<p>This is my first servlet</p>");
		pr.println("</div>");
		pr.println("</body>");
		pr.println("</html>");

	}
	

}
