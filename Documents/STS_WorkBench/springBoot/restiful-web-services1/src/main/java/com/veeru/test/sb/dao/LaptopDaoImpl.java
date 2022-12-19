package com.veeru.test.sb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.veeru.test.sb.model.Customer;
import com.veeru.test.sb.model.Laptop;
import com.veeru.test.sb.util.JDBCUtil;

//@Repository("LaptopDao")
public class LaptopDaoImpl {
//implements LaptopDao {

	/*
	 * @Override public Laptop insertLaptop(Laptop laptop) { try { Connection
	 * connection = JDBCUtil.getConnection(); //HibernateUtil. PreparedStatement
	 * psmts = connection.prepareStatement("insert into laptop values(?,?,?,?)");
	 * psmts.setInt(1, laptop.getsNumber()); psmts.setString(2,
	 * laptop.getCompany()); psmts.setString(3, laptop.getName());
	 * psmts.setString(4, laptop.getModel());
	 * 
	 * int row = psmts.executeUpdate();
	 * System.out.println(" insert the data is successfully :: " + row); return
	 * laptop;
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return new Laptop(); }
	 * 
	 * @Override public Laptop updatelaptop(Laptop laptop) { try { Connection
	 * connection = JDBCUtil.getConnection(); String updateQuery =
	 * "update laptop set company=?, name=?, model=? where sNumber=?";
	 * System.out.println("Get the data successfully"); PreparedStatement psmts =
	 * connection.prepareStatement(updateQuery);
	 * 
	 * psmts.setString(1, laptop.getCompany()); psmts.setString(2,
	 * laptop.getName()); psmts.setString(3, laptop.getModel()); psmts.setInt(4,
	 * laptop.getsNumber());
	 * 
	 * int row = psmts.executeUpdate();
	 * System.out.println("update the data is successfully ::" + row);
	 * 
	 * if (row > 0) { return laptop; }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } return new Laptop(); }
	 * 
	 * @Override public Laptop getlaptop(int sNumber) { Laptop laptop = new
	 * Laptop();
	 * 
	 * try { Connection connection = JDBCUtil.getConnection(); String selectQuery =
	 * "select * from laptop where sNumber=?"; PreparedStatement psmts =
	 * connection.prepareStatement(selectQuery); psmts.setInt(1, sNumber);
	 * 
	 * ResultSet rs = psmts.executeQuery(); while (rs.next()) {
	 * laptop.setsNumber(rs.getInt("sNumber"));
	 * laptop.setCompany(rs.getString("company"));
	 * laptop.setName(rs.getString("name")); laptop.setModel(rs.getString("model"));
	 * 
	 * }
	 * 
	 * } catch (Exception e) { e.printStackTrace();
	 * 
	 * } return laptop; }
	 * 
	 * @Override public List<Laptop> getlaptop() { List<Laptop> list = new
	 * ArrayList<>(); try { Connection connection = JDBCUtil.getConnection(); String
	 * selectQuery = "select * from laptop"; PreparedStatement psmts =
	 * connection.prepareStatement(selectQuery); ResultSet rs =
	 * psmts.executeQuery(); while (rs.next()) { Laptop lp = new Laptop();
	 * lp.setsNumber(rs.getInt(1)); lp.setCompany(rs.getString(2));
	 * lp.setName(rs.getString(3)); lp.setModel(rs.getString(4)); list.add(lp);
	 * 
	 * }
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } return list; }
	 * 
	 * @Override public int deletelaptop(int sNumber) { int row = 0; try {
	 * Connection connection = JDBCUtil.getConnection(); String deleteQuery =
	 * "delete from laptop where sNumber=?"; PreparedStatement pstmt =
	 * connection.prepareStatement(deleteQuery); pstmt.setInt(1, sNumber); row =
	 * pstmt.executeUpdate();
	 * System.out.println("delete the data is successfully :: " + row);
	 * 
	 * if (row > 0) { return row; } } catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * return row; }
	 */
}
