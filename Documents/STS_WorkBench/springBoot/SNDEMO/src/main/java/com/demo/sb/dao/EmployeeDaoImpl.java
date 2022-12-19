package com.demo.sb.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.demo.sb.Employee;
import com.demo.sb.util.DBConnection;

@Repository
//@ComponentScan(basePackages = "com.test.sb.util")
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getEmployes() {
		List<Employee> list = new ArrayList<>();

		try {
			// Employee emp=null;
			System.out.println("======entered into the EmployeeDaoImpl class ========");
			DBConnection.getConnection();
			//PreparedStatement pstmt = DBConnection.getPreparedStatement("select * from employee");
			Statement stmt = DBConnection.getStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			// ResultSet rs=pstmt.executeQuery();
			System.out.println("======rs executed ========" + rs);

			while (rs.next()) {
				// emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setEmail(rs.getString(3));
				System.out.println(
						"======rs next() ========" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

				list.add(emp);
				// rs.getString(2);
				// rs.getString(3);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int deleteEmployes(int eid) {
		int i = 0;
		System.out.println("======entered into the deleteEmployes EmployeeDaoImpl class ========");
		try {
			DBConnection.getConnection();
			Statement stmt = DBConnection.getStatement();
			i = stmt.executeUpdate("delete from employee where empno=" + eid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	@Override
	public int updateEmployee(Employee employee) {
		int row = 0;
		try {
			String SQL = "update employee set name=?, email=? where  empno=?";
			DBConnection.getConnection();
			PreparedStatement pstmt = DBConnection.getPreparedStatement(SQL);
			pstmt.setString(1, employee.getName());
			pstmt.setString(2, employee.getEmail());
			pstmt.setInt(3, employee.getEmpId());
			row = pstmt.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return row;
	}

	@Override
	public int insertEmployee(Employee employee) {
		int row = 0;
		try {
			String SQL = "insert into employee(empno,name,email)values("+employee.getEmpId()+"," +"\'"+employee.getName()+"\'"+","+"\'"+employee.getEmail()+"\'" +")";
					//INSERT INTO tablename(field1,field2) VALUES
			DBConnection.getConnection();
			
			//Statement stmt = DBConnection.getStatement();
			//row = stmt.executeUpdate(SQL);
			
			
			//PreparedStatement pstmt = DBConnection.getPreparedStatement(SQL);
			//row=pstmt.executeUpdate();
			
			String str = "insert into employee(empno,name,email)values(?,?,?)";
			PreparedStatement pstmt = DBConnection.getPreparedStatement(str);
			pstmt.setInt(1, employee.getEmpId());
			pstmt.setString(2, "\'" + employee.getName() + "\'");
			//if(!employee.getEmail().equals("null"))
			
			//if(Objects.nonNull(employee.getEmail())){
			pstmt.setString(3, "\'" + employee.getEmail() + "\'");
			//}
			row = pstmt.executeUpdate();
		 
		} catch (Exception e) {
			e.printStackTrace();
		}

		return row;
	}

	@Override
	public Employee getEmployeeID(int eid) {
		System.out.println("======entered into the deleteEmployes EmployeeDaoImpl class ========");
		Employee emp=null;
		try {
			DBConnection.getConnection();
			Statement stmt = DBConnection.getStatement();
			ResultSet rs = stmt.executeQuery("select * from employee where empno=" + eid);
			
			while (rs.next()) {
				 emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

}
