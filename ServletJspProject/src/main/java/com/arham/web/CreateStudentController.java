package com.arham.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arham.web.dao.StudentDAO;
import com.arham.web.model.Student;

public class CreateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreateStudentController() {
        super();

    }
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		int rollNo = Integer.parseInt(request.getParameter("RollNo"));
		String studentName = request.getParameter("StudentName");
		String className = request.getParameter("ClassName");
		
		StudentDAO dao = new StudentDAO();
		Student newStudent = new Student(rollNo, studentName, className);
		dao.createStudent(newStudent);
		
		request.setAttribute("Student", newStudent);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("showStudent.jsp");
		requestDispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
