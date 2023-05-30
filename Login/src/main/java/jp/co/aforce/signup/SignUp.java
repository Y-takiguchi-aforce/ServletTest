package jp.co.aforce.signup;

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
 * Servlet implementation class SignUp
 */
@WebServlet("/jsp/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		
		try {
			String userId = request.getParameter("id");
			String userPw = request.getParameter("pw");
			String userName = request.getParameter("user"); 
			
			Pinfo p = new Pinfo();
			p.setId(userId);
			p.setPw(userPw);
			p.setUser(userName);
			
			LoginDAO dao = new LoginDAO();
			int line = dao.insert(p);
			
			if(line>0) {
				request.getRequestDispatcher("signup_finish.jsp").forward(request, response);
			}
			
		}catch(Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}

}
