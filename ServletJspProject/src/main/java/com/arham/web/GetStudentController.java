package com.arham.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arham.web.dao.StudentDAO;
import com.arham.web.model.Student;

public class GetStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetStudentController() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rollNo = Integer.parseInt(request.getParameter("RollNo"));
		StudentDAO dao = new StudentDAO();
		Student student = dao.getStudent(rollNo);
		
		request.setAttribute("Student", student);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("showStudent.jsp");
		requestDispatcher.forward(request, response);
	}

	
}
