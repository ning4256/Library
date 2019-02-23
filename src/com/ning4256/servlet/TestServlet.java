package com.ning4256.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ning4256.service.UserService;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserService service = new UserService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("users", service.getAllUser());
//		session.setAttribute("books", service.getAllBook());
		System.out.println(session.getAttribute("users"));
//		System.out.println(session.getAttribute("books"));
		request.getRequestDispatcher("/jsp/userlist.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
