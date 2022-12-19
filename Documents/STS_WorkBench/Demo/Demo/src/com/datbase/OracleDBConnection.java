package com.datbase;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDBConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYS", "veeranji_789");
		 System.out.println("connected  :: "+con);

	}

}
