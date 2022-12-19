package com.demo.sb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.demo.sb.Employee;


public class DBConnection {
	
	static Connection connection;
	static Statement statement=null;
	static PreparedStatement preparedStatement=null;
	
	
	
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/veerudb", "root", "Veerus@789");
		System.out.println("======DB Connection successfully========");
		return connection;
	}
	
	public static Statement getStatement() throws Exception {
		return connection.createStatement();
	}
	

	
	  public static PreparedStatement getPreparedStatement(String sql) throws Exception {
		  return connection.prepareStatement(sql);
		  }
	  
	  public static int getExcutedUpdate(PreparedStatement pstmt,Employee employee) throws Exception {
		  	pstmt.setInt(1,employee.getEmpId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getEmail());
		  return pstmt.executeUpdate();
	  }
	  
	  public static ResultSet getExecuteQuery(String sql) throws Exception {
		return statement.executeQuery(sql);
	  }
	  
	  public static int excutedUpdate(PreparedStatement pstmt) throws Exception {
		  return pstmt.executeUpdate();
	  }
	 

}
