/**
 * 
 */
package com.demo.sb.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.sb.model.User;
import com.demo.sb.util.DBConnection;
/*import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;*/

/**
 * @author veeru
 *
 */

@Repository
public class UserDaoImpl implements UserDao {
	
	/*
	 * private static final org.apache.logging.log4j.Logger
	 * log=org.slf4j.LoggerFactory.getLogger(UserDaoImpl.class); log.info("");
	 * log.debug("");
	 */
	
	
	@Override
	public List<User> insertUser(User user) {
		// String SQL = "insert into
		// employee(empno,name,email)values("+employee.getEmpId()+","
		// +"\'"+employee.getName()+"\'"+","+"\'"+employee.getEmail()+"\'" +")";
		
		
		//String createQuery = "create table user1(username VARCHAR(40) NOT NULL, password VARCHAR(40) NOT NULL)";

		String insertQuery = "insert into user1(username,password)values(?,?)";

		String selectQuery = "select * from user1";

		List<User> listUser = new ArrayList<>();

		try {
			DBConnection.getConnection();
			Statement stmt = DBConnection.getStatement();
			//int rowCreate = stmt.executeUpdate(createQuery);
			
			//System.out.println("create Query executed :: "+rowCreate);
			

			PreparedStatement pstmt = DBConnection.getPreparedStatement(insertQuery);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getPassword());
			int rowInsert = pstmt.executeUpdate();
			
			System.out.println("Insert Query executed :: "+rowInsert);

			ResultSet rs = stmt.executeQuery(selectQuery);
			System.out.println("Select Query executed and return the ResultSet:: ");

			while (rs.next()) {
				User userObj = new User();
				userObj.setUserName(rs.getString("username"));
				userObj.setPassword(rs.getString("password"));
				listUser.add(userObj);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listUser;
	}
	
	
	public List<User> insertHBUser(User user) {
		
		return null;
		
	}

}
