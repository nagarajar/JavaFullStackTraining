package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
	/*
	 * 
	 * ServletConfig and ServletContext
	 * 
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		//Servlet context is interface
		ServletContext sctx = getServletContext();
		String str = sctx.getInitParameter("name");
		out.println(str);
	}
}
