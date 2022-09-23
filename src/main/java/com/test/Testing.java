package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.database.EmpDAO;
import com.database.JDBCConnect;

public class Testing {
	public boolean isConnected() throws SQLException {
		Connection con = JDBCConnect.getconnect();
		return con != null;

	}

	public int isUser() {

		EmpDAO dao = new EmpDAO();
		int empId = 470;
		String empName = "Ramya";

		boolean isValidUser = dao.isValidUser(empId, empName);
		if (isValidUser)
			return 1;
		return 0;

	}

}