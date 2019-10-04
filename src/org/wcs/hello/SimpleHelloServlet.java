package org.wcs.hello;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleHelloServlet
 */

@WebServlet("/")

public class SimpleHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SimpleHelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("Simple hello!");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/hello-form.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// reccuperation des params
		String name = request.getParameter("user_name");
		String strAge = request.getParameter("user_age");
		String email = request.getParameter("user_email");
		String time = request.getParameter("appt");
		String[] h = time.split(":");
		String message = "Je n'ai pas compris l'heure";

		int resultTime = Integer.valueOf(h[0]);
		
		if (resultTime <= 11) {
			message = "Good morning";
		} else if (resultTime >= 11 && resultTime <= 16) {
			message = "Good afternoon";
		} else if (resultTime >= 17) {
			message = "Good evening";
		}

		request.setAttribute("nameUser", name);
		request.setAttribute("messageUser", message);
		request.setAttribute("ageUser", strAge);
		request.setAttribute("mailUser", email);
		request.setAttribute("timeUser", time);

		this.getServletContext().getRequestDispatcher("/WEB-INF/custom-hello.jsp").forward(request, response);

	}

}
