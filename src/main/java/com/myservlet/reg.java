package com.myservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.EmpDAO;
import com.empdetails.Employee;

/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("user");
		String pass=req.getParameter("pass");
		String email=req.getParameter("email");
		//LocalDateTime d=  LocalDateTime.now();
		Employee e=new Employee(user, pass, email);
		EmpDAO rd=new EmpDAO();
		rd.insertEmp(e);
		RequestDispatcher d= req.getRequestDispatcher("login.jsp");
		d.forward(req, resp);
		
}

}
