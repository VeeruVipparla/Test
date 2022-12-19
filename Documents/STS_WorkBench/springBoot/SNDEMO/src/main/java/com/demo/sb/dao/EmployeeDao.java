/**
 * 
 */
package com.demo.sb.dao;

import java.util.List;

import com.demo.sb.Employee;

/**
 * @author veeru
 *
 */
public interface EmployeeDao {

	List<Employee> getEmployes();

	int deleteEmployes(int eid);

	int updateEmployee(Employee employee);

	int insertEmployee(Employee employee);

	Employee getEmployeeID(int eid);

}
