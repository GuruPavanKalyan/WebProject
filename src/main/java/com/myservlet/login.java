package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.EmpDAO;
import com.empdetails.Employee;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession se= req.getSession();
		String user=req.getParameter("user");
		String pass=req.getParameter("pass");
		se.setAttribute("user", user);
		se.setAttribute("pass", pass);
	
//		rd.forward(req, resp);
//		p.println(user+pass);
		EmpDAO ed=new EmpDAO ();
		String pass2= ed.checkUser(user);
		
		if (pass.equals(pass2)){
			RequestDispatcher rd= req.getRequestDispatcher("success.jsp");
			rd.include(req, resp);
			ed.updateEmpIn(user);
			LocalDateTime l= LocalDateTime.now();
			
			p.print("<h1> your logged at ");
			p.println(l);
			p.println("<br>");
			p.println();
			p.println();
			List<Employee> u= new ArrayList<>();
			u.addAll(ed.getUsers());
			p.println("<table cellspacing='0' width=50px border=2px>");
			p.println("<tr>");
			p.println("<td>email</td>");
			p.println("<td>password</td>");
			p.println("<td>username<td>");
			p.println("</tr>");
			for (Employee s:u) {
				p.println("<tr>");
				p.println("<td>"+s.getEmpName()+"</td>");
				p.println("<td>"+s.getPass()+"</td>");
				p.println("<td>"+s.getEmail()+"</td>");
				p.println("<td>"+"<a href='' >Delete</a></td>");
				p.println("<td>"+"<a href=''>Update</a></td>");
				p.println("</tr>");
				
			}
			p.println("</table>");

			
			
			}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
			p.println("<p>Invalid user or password.Try login again.");
			p.println("<p>Not an existing user?<span><a href=\"http://localhost:8081/Registration_task/Reg.jsp\" style=\"text-decoration:none;color:green;\"> Sign Up</a></span><p> ");
			

		}
	
			
		}
	

}
