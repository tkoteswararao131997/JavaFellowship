package com.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Doa.loginDoa;

@WebServlet("/login")
public class LogInServlet extends HttpServlet {
	loginDoa doa = new loginDoa();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uname = request.getParameter("uname");
		System.out.println(uname);
		String pwd = request.getParameter("pwd");
		System.out.println(pwd);
		if (doa.isuser(uname, pwd) == true) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("website.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
