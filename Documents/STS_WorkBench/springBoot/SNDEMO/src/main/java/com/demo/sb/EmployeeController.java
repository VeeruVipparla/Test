package com.demo.sb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sb.model.User;
import com.demo.sb.service.EmployeeService;
import com.demo.sb.service.UserService;

@Configuration
@RestController
//@ComponentScan(basePackages ="com.test.sb.service")
//@PropertySource("classpath:application.properties")
@PropertySource({"classpath:application.properties", "classpath:veeru.properties"})
@ConfigurationProperties 
//({"application.properties", "veeru.properties"});
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	UserService userService;
	
	@Value("${hello_world}")
	private String hello;
	
	// @Value("#{'${com.mycompany.propertygroup.propertyname:${oldconvention.propertyname:}}'}")
	// private String myValue;
	
	@Value("${user_name}")
	private String userName;
	
	
	
	@GetMapping(path="/hello")
	public String hello() {
		return hello+", welcome to learn SpringBoot :: "+userName;
	}
	
	@GetMapping(path="/hello/{user}")
	public String hello(@PathVariable String user) {
		return "Hello, welcome to "+ user+" learn SpringBoot.";
	}
	
	@GetMapping(path="/hello1")
	public String helloUser(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		return "Hello, welcome to  Spring Boot RequestParam :: "+ userName +"\t password :: "+password;
	}
	
	@PostMapping(path="/sb/user")
	public List<User> userSB(@RequestBody User user) {
		List<User> userList=userService.insertUser(user);
		return userList;
		//return " @RequestBody :: "+ user.getUserName() +"\t password :: "+user.getPassword();
	}
	
	@GetMapping(path="/employees")
	public Map<String, List<Employee>> employee() {
		List<Employee> list= employeeService.getEmployes();
		System.out.println("======EmployeeController executed successfully========"+list);
		Map<String, List<Employee>> mapEmployee=new HashMap<>();
		
		mapEmployee.put("employees", list);
		return mapEmployee;
	}
	
	@PutMapping(path="/employeeupdate")
	public Employee updateEmployee(@RequestBody @Valid Employee employee) {
		int i=employeeService.updateEmployee(employee);
		System.out.println("update the record based on the Employee ID "+employee +"\t"+i);
		return employee;
		
	}
	
	
	@PostMapping(path="/employeeinsert")
	public Employee insertEmployee(@RequestBody @Valid Employee employee) {
		int i=employeeService.insertEmployee(employee);
		System.out.println("insert the record in the Data Base "+employee +"\t"+i);
		return employee;
	}
	
	
	@DeleteMapping(path="/employee/{eid}")
	public int employee(@PathVariable int eid) {
		int i= employeeService.deleteEmployes(eid);
		System.out.println("======EmployeeController executed successfully========"+i);
		return i;
	}
	
	@GetMapping(path="/employees/{eid}")
	public Employee getEmployeeID(@PathVariable int eid) {
		Employee employee= employeeService.getEmployeeID(eid);
		return employee;
		
	}
	
	

}






/*List<Employee> list=new ArrayList<>();
 * Employee e1=new Employee(100, "aaa", "aaa@gmail.com");
 * 
 * list.add(e1); list.add(new Employee(200, "bbb", "bbb@gmail.com"));
 * list.add(new Employee(300, "ccc", "ccc@gmail.com")); list.add(new
 * Employee(400, "ddd", "ddd@gmail.com"));
 */