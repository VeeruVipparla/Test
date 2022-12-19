package com.veeru.test.sb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.veeru.test.sb.model.Customer;

@Repository("customerDAO")
public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer insertCustomer(Customer customer) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veerudb", "root", "Veerus@789");
			System.out.println("===========coneected the Data base===========");
			// String sql="insert into customer values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement("insert into customer1 values(?,?,?,?)");
			pstmt.setInt(1, customer.getCid());
			pstmt.setString(2, customer.getCname());
			pstmt.setString(3, customer.getPhone());
			pstmt.setString(4, customer.getAddress());

			int row = pstmt.executeUpdate();
			System.out.println(" insert the data is successfully :: " + row);
			if (row > 0) {
				return customer;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new Customer();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veerudb", "root", "Veerus@789");
			System.out.println("===========coneected the Data base===========");
			
			String updateQuery="update customer1 set cname=?, phone=?, address=? where cid=?";
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			
			pstmt.setString(1, customer.getCname());
			pstmt.setString(2, customer.getPhone());
			pstmt.setString(3, customer.getAddress());
			pstmt.setInt(4, customer.getCid());

			int row = pstmt.executeUpdate();
			System.out.println(" update the data is successfully :: " + row);
			if (row > 0) {
				return customer;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return new Customer();
	}

	@Override
	public int deleteCustomer(int cid) {
		int row=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veerudb", "root", "Veerus@789");
			System.out.println("===========coneected the Data base===========");
			
			String deleteQuery="delete from customer1 where cid=?";
			PreparedStatement pstmt = con.prepareStatement(deleteQuery);
			pstmt.setInt(1, cid);
			row = pstmt.executeUpdate();
			System.out.println("delete the data is successfully :: " + row);
			
			if (row > 0) {
				return row;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return row;
	}

	@Override
	public Customer getCustomer(int cid) {
		Customer customer=new Customer();
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veerudb", "root", "Veerus@789");
		System.out.println("===========coneected the Data base===========");
		
		String selectQuery="select * from customer1 where cid=?";
		
		PreparedStatement pstmt=con.prepareStatement(selectQuery);
		pstmt.setInt(1, cid);
		ResultSet  rs=pstmt.executeQuery();
		
		while (rs.next()) {
			customer.setCid(rs.getInt("cid"));
			customer.setCname(rs.getString("cname"));
			customer.setPhone(rs.getString("phone"));
			customer.setAddress(rs.getString("address"));
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}

	@Override
	public List<Customer> getCustomer() {
		List<Customer> list=new ArrayList<>();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veerudb", "root", "Veerus@789");
		System.out.println("===========coneected the Data base===========");
		
		String selectQuery="select * from customer1";
		
		PreparedStatement pstmt=con.prepareStatement(selectQuery);
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			Customer c=new Customer();
			c.setCid(rs.getInt(1));
			c.setCname(rs.getString(2));
			c.setPhone(rs.getString(3));
			c.setAddress(rs.getString(4));
			list.add(c);
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
