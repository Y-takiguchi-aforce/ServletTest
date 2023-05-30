package jp.co.aforce.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.Pinfo;
import jp.co.aforce.dao.LoginDAO;
import jp.co.aforce.tool.Page;

/**
 * Servlet implementation class Login
 */
@WebServlet("/jsp/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		String userId = request.getParameter("id");
		String userPw = request.getParameter("pw");

		LoginDAO dao = new LoginDAO();

		try {
			Pinfo p = dao.search(userId, userPw);

			if (p != null) {
				request.getRequestDispatcher("login_success.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("login_failure.jsp").include(request, response);
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Page.footer(out);
	}
}
