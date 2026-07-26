package com.in28minutes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		if (name != null && !name.isEmpty()) {
			request.setAttribute("name", name);
		} else {
			request.setAttribute("name", "{param name}");
		}

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	};

}
