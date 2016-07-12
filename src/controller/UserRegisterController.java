package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.InsertNewUser;
import DTO.User;


public class UserRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String role=request.getParameter("role");
		User user =new User(9, username, password, email,role);
		boolean isSuccess=new InsertNewUser().insert(user);
		if(!isSuccess){
			System.out.println("Sorry there's some problem. We cannot register you, please try again!");
			request.getRequestDispatcher("").forward(request, response);
			
		}else{
			request.setAttribute("user", user);
			request.getRequestDispatcher("actionlogin").forward(request, response);
		}
	}

}
