package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbconnection.studentdb;
import models.student;
import services.studentservices;

@WebServlet("/register")
public class studentservlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int student_id = Integer.parseInt( req.getParameter("stu_id"));
		
		String student_name = req.getParameter("stu_name");
		
		String student_email = req.getParameter("stu_email");
		
		long student_phn = Integer.parseInt(req.getParameter("stu_phn"));
		
		String student_branch = req.getParameter("stu_branch");
		
		student st = new student(student_id,student_name,student_email,student_phn,student_branch);
		
		studentservices services = new studentservices(studentdb.getConnection());
		
//		HttpSession ht = req.getSession();
		
		boolean f = services.addstudent(st);
		
		if(f) {
			
			System.out.println("successfully inserted");
			resp.sendRedirect("home.jsp");
		}
		
		else {
			
			System.out.println("error");
			resp.sendRedirect("error.jsp");
		}
		super.doPost(req, resp);
	}

}
