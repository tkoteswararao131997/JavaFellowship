package com.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class SignInServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if(uname.equals("koti") && pwd.equals("123"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("website.jsp");
		}
		else
			response.sendRedirect("login.jsp");
	}

}
