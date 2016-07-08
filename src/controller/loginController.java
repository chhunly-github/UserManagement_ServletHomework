package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.GetUserByLogin;
import DTO.User;

public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=(User) new GetUserByLogin(username, password).get();
		if(user==null){
			response.sendRedirect("login");
		}
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		System.out.println("login success");
		String sender=(String) session.getAttribute("sender");
		System.out.println(sender);
		if(sender==null)
			response.sendRedirect("home");
		else
			response.sendRedirect(sender);
	}

}
