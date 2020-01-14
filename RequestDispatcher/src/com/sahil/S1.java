package com.sahil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/S1")
public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String s1 = request.getParameter("username");
		String s2 = request.getParameter("password");
		
		if(s2.equals("1234") && s1.equals("sahil")) 
		{
			RequestDispatcher rd = request.getRequestDispatcher("S2");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h3>Your username and passsword are not match</h3>");
			RequestDispatcher rm = request.getRequestDispatcher("index.html");
			rm.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
