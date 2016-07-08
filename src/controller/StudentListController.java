package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.GetAllStudents;
import DTO.Student;



public class StudentListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public StudentListController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		@SuppressWarnings("unchecked")
		ArrayList<Student> students =(ArrayList<Student>) new GetAllStudents().get();
		request.setAttribute("students", students);
		request.getRequestDispatcher("view.jsp")
			.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
