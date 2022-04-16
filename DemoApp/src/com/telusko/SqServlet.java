package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
//		int k = (int)req.getAttribute("k"); // Method 01
//		k= k * k;
//		PrintWriter out = res.getWriter();
//		out.println("Result is : "+k);
		//out.println("Hello your in SqServlet ");
//     	System.out.println("Sq servlet.....!");
		
//		int k = Integer.parseInt(req.getParameter("k")); // Method 02
//		k= k * k;
//		PrintWriter out = res.getWriter();
//		out.println("Result is : "+k);
//		//out.println("Hello your in SqServlet ");
		
//		HttpSession session = req.getSession(); // Method 03
//		int k = (int)session.getAttribute("k");
//		k= k * k;
//		PrintWriter out = res.getWriter();
//		out.println("Result is : "+k);
		
	// Using Cookies - Method 04
		int k = 0;                      
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}
		k= k * k;
		PrintWriter out = res.getWriter();
		out.println("Result is : "+k);
		
	}
}
