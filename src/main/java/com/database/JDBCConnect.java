package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnect {
	public static Connection connect;
	public static Connection getconnect() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteria", "root","bguru");
			return connect;
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		return null;
	}

}
