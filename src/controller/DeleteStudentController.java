package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DeleteStudent;
import DAO.GetAllStudents;
import DTO.Student;

/**
 * Servlet implementation class DeleteStudents
 */

public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		new DeleteStudent(Integer.parseInt(request.getParameter("id"))).execute();	
		@SuppressWarnings("unchecked")
		ArrayList<Student> students=(ArrayList<Student>) new GetAllStudents().get();
		request.setAttribute("students", students);
		request.getRequestDispatcher("view.jsp")
				.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
