package com.datbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDBTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		 * Class.forName("oracle.jdbc.driver.OracleDriver"); Connection
		 * con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
		 * "SYSDBA", "veeranji_789");
		 */
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/veerudb", "root", "Veerus@789");
		
		System.out.println("Connectionected The DB "+con);
		
		String query="insert into employee values(400, 'Lasya', 'Lasya@gmail.com')";
		Statement stmt=con.createStatement();
		int i=stmt.executeUpdate(query);
		System.out.println("THE QUERY IS EXECUTED "+i);
		
		String querySelect="select * from employee";
		ResultSet rs=stmt.executeQuery(querySelect);
		System.out.println("==========The selct query executed ============");
		
		while (rs.next()) {
			System.out.print("Employee ID :: "+rs.getInt("empno")+"\t");
			System.out.print("Employee name :: "+rs.getString("name")+"\t");
			System.out.print("Employee email:: "+rs.getString("email")+"\t");
			System.out.println("");
			System.out.println(" Records completed");
			
		}
		

	}

}
