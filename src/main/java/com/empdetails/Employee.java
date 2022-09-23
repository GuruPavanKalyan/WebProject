package com.empdetails;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee {
	
	private String email;
	private String empName;
	private String pass;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Employee(String email, String empName, String pass) {
		super();
		this.email = email;
		this.empName = empName;
		this.pass = pass;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [email=" + email + ", empName=" + empName + ", pass=" + pass + "]";
	}
	
}