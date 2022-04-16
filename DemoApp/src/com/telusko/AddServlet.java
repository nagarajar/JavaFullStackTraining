package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add") // Annotation - we can use this to call servlet from html page instead of using web.xml
public class AddServlet extends HttpServlet
{
	//public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i +j;
		
		
		// Session Management - used to sent data from one servlet to another servlet
		//               key  value
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sq"); // Method 01
//		rd.forward(req, res);
		
//		res.sendRedirect("sq?k="+k);  // URL Rewriting (Session Management) - Method 02
		
		// Using session object to access data through out the servlets - Method 03
//		HttpSession session = req.getSession();
//		
//		session.setAttribute("k", k);
//		
//		res.sendRedirect("sq");
		
		// Using Cookies class object we can access the data  - Method 04 
		Cookie cookie = new Cookie("k", k+""); // this object accept only string value
		res.addCookie(cookie); // this will send the response to client
		res.sendRedirect("sq");
		
		
		
	}
}
