package com.arham.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arham.web.dao.StudentDAO;

public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteStudentController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollNo = Integer.parseInt(request.getParameter("RollNo"));
		
		StudentDAO dao = new StudentDAO();
		dao.deleteStudent(rollNo);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
