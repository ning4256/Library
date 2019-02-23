package com.ning4256.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ning4256.pojo.Users;
import com.ning4256.service.UserService;

/**
 * Servlet implementation class AllServlet
 */
public class AllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService service = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Users users = new Users();
		users.setUser_id(1);
//		session.setAttribute("User", users);
		session.setAttribute("UserBook", service.getBooks999(users));
		request.getRequestDispatcher("/jsp/userBook.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
