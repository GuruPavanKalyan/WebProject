package com.database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.empdetails.Employee;
import com.mysql.cj.jdbc.JdbcConnection;
import com.database.JDBCConnect;

public class EmpDAO {
	public boolean insertEmp(Employee e) {
		String sql = "insert into emp(empName,empPass,email,regDate) values(?,?,?,now())";
		try {
			PreparedStatement p = JDBCConnect.getconnect().prepareStatement(sql);

			p.setString(1, e.getEmail());
			p.setString(2, e.getEmpName());
			p.setString(3, e.getPass());

			// p.setDate(4, e.getRegDate());
			return p.executeUpdate() > 0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;

	}

	public String checkUser(String user) {
		String sql = "select empPass from emp where empName=?";
		try {
			PreparedStatement p = JDBCConnect.getconnect().prepareStatement(sql);
			p.setString(1, user);
			ResultSet rd = p.executeQuery();
			String pass = null;
			while (rd.next()) {
				pass = rd.getString("empPass");
			}
			return pass;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;

	}

	public boolean updateEmpIn(String user) {
		String sql = "update emp set logdate=now() where empName=?";
		try {
			PreparedStatement p = JDBCConnect.getconnect().prepareStatement(sql);
			p.setString(1, user);
			return p.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean updateEmpOut(String user) {
		String sql = "update emp set logodate=now() where empName=?";
		try {
			PreparedStatement p = JDBCConnect.getconnect().prepareStatement(sql);
			p.setString(1, user);
			return p.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public List<Employee> getUsers() {
		List<Employee> l = new ArrayList<>();
		String sql = "select * from emp";

		try {
			PreparedStatement p = JDBCConnect.getconnect().prepareStatement(sql);
			Employee em = null;
			ResultSet res = p.executeQuery();
			while (res.next()) {
				String user = res.getString("empName");
				String pass = res.getString("empPass");
				String email = res.getString("email");
//				String reg=res.getString("regDate");
//				String log=res.getString("logDate");
//				String logo=res.getString("logoDate");
				em = new Employee(user, email, pass);
				l.add(em);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;

	}

	public boolean isValidUser(int empId, String empName) {
		String query = "select * from registration where empId = ?";
		int userCount = 0;
		String name = null;

		try {
			PreparedStatement statement = JDBCConnect.getconnect().prepareStatement(query);
			statement.setInt(1, empId);
			ResultSet res = statement.executeQuery();

			while (res.next()) {
				userCount++;
				name = res.getString(2);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return userCount == 1 && name.equals(empName);
	}

}
