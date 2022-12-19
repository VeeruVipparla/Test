package com.model.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeEX {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	EmployeeEX(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "EmployeeEX [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		List<EmployeeEX> employeeExList = new ArrayList<EmployeeEX>();

		employeeExList.add(new EmployeeEX(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeExList.add(new EmployeeEX(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeExList.add(new EmployeeEX(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeExList.add(new EmployeeEX(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeExList.add(new EmployeeEX(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeExList.add(new EmployeeEX(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeExList.add(new EmployeeEX(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeExList.add(new EmployeeEX(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeExList.add(new EmployeeEX(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeExList.add(new EmployeeEX(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeExList.add(new EmployeeEX(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeExList.add(new EmployeeEX(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeExList.add(new EmployeeEX(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeExList.add(new EmployeeEX(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeExList.add(new EmployeeEX(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeExList.add(new EmployeeEX(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeExList.add(new EmployeeEX(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// Query 3.1 : How many male and female employees are there in the organization?
		System.out.println("Male And Female Employees Of in this Organization->");
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeExList.stream()
				.collect(Collectors.groupingBy(EmployeeEX::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);

		// Query 3.2 : Print the name of all departments in the organization?
		System.out.println();
		System.out.println("List Of the Departments in this Organization->");
		employeeExList.stream().map(EmployeeEX::getDepartment).distinct().forEach(System.out::println);

		// Query 3.3 : What is the average age of male and female employees?

		System.out.println();
		System.out.println("Average Age of the Male And Female Employees->");
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeExList.stream()
				.collect(Collectors.groupingBy(EmployeeEX::getGender, Collectors.averagingInt(EmployeeEX::getAge)));
		System.out.println(avgAgeOfMaleAndFemaleEmployees);

		// Query 3.4 : Get the details of highest paid employee in the organization?
		System.out.println();
		System.out.println("Highest Paid employee of in this Organization->");

		Optional<EmployeeEX> highestPaidEmployeeWrapper = employeeExList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeEX::getSalary)));

		EmployeeEX highestPaidEmployee = highestPaidEmployeeWrapper.get();

		// System.out.println("Details of Highest Paid Employee: ");
		System.out.println("==============================");

		System.out.println("ID::- " + highestPaidEmployee.getId());
		System.out.println("Name::- " + highestPaidEmployee.getName());
		System.out.println("Age::- " + highestPaidEmployee.getAge());
		System.out.println("Gender::- " + highestPaidEmployee.getGender());
		System.out.println("Department::- " + highestPaidEmployee.getDepartment());
		System.out.println("Year Of Joining::-" + highestPaidEmployee.getYearOfJoining());
		System.out.println("Salary::- " + highestPaidEmployee.getSalary());

		// Query 3.5 : Get the names of all employees who have joined after 2015?
		System.out.println();
		System.out.println("Name of the employees Joined In the year 2015->");
		employeeExList.stream().filter(e -> e.getYearOfJoining() > 2015).map(EmployeeEX::getName)
				.forEach(System.out::println);

		// Query 3.6 : Count the number of employees in each department?
		System.out.println();
		System.out.println("Count The No Of Employees OF Each Department->");
		Map<String, Long> employeeExCountByDepartment = employeeExList.stream()
				.collect(Collectors.groupingBy(EmployeeEX::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = employeeExCountByDepartment.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Query 3.7 : What is the average salary of each department?
		System.out.println();
		System.out.println("Average salary of the Each Department->");
		Map<String, Double> avgSalaryOfDepartment = employeeExList.stream().collect(
				Collectors.groupingBy(EmployeeEX::getDepartment, Collectors.averagingDouble(EmployeeEX::getSalary)));
		Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartment.entrySet();
		for (Entry<String, Double> entry1 : entrySet1) {
			System.out.println(entry1.getKey() + " : " + entry1.getValue());
		}

		// Query 3.8 : Get the details of youngest male employee in the product
		// development department?
		System.out.println();
		System.out.println("Youngest Paid Employee of the Development Department->");
		Optional<EmployeeEX> youngestMaleEmployeeInProductDevelopmentWrapper = employeeExList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(EmployeeEX::getAge));
		EmployeeEX youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
		System.out.println("Deatails of the Youngest Male Employee In Product development Deparment->");
		System.out.println("----------------------------------------");
		System.out.println("ID ::- " + youngestMaleEmployeeInProductDevelopment.getId());
		System.out.println("Name ::-" + youngestMaleEmployeeInProductDevelopment.getName());
		System.out.println("Age ::-" + youngestMaleEmployeeInProductDevelopment.getAge());
		System.out.println("Year Of Joining ::-" + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
		System.out.println("Salary ::-" + youngestMaleEmployeeInProductDevelopment.getSalary());

		// Query 3.9 : Who has the most working experience in the organization?

		Optional<EmployeeEX> senoirMostEmployeeWrapper = employeeExList.stream()
				.sorted(Comparator.comparingInt(EmployeeEX::getYearOfJoining)).findFirst();
		EmployeeEX seniorMostEmployee = senoirMostEmployeeWrapper.get();

		System.out.println("Senior Most Employee Details->:");
		System.out.println("----------------------------");
		System.out.println("ID : " + seniorMostEmployee.getId());
		System.out.println("Name : " + seniorMostEmployee.getName());
		System.out.println("Age : " + seniorMostEmployee.getAge());
		System.out.println("Gender : " + seniorMostEmployee.getGender());
		System.out.println("Age : " + seniorMostEmployee.getDepartment());
		System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());
		System.out.println("Salary : " + seniorMostEmployee.getSalary());

		// Query 3.10 : How many male and female employees are there in the sales and
		// marketing team?

		System.out.println();
		System.out.println("Male And Female Employees in Sales And Marketing Team->");

		Map<String, Long> countMaleAndFemaleEmployeesInSalesMArketing = employeeExList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(EmployeeEX::getGender, Collectors.counting()));
		System.out.println(countMaleAndFemaleEmployeesInSalesMArketing);

		// Query 3.11 : What is the average salary of male and female employees?
		System.out.println();
		System.out.println("avgSalaryOfMaleAndFemaleEmplyees in This Organization->");

		Map<String, Double> avgSalaryOfMaleAndFemaleEmplyees = employeeExList.stream().collect(
				Collectors.groupingBy(EmployeeEX::getGender, Collectors.averagingDouble(EmployeeEX::getSalary)));
		System.out.println(avgSalaryOfMaleAndFemaleEmplyees);

		// Query 3.12 : List down the names of all employees in each department?

		System.out.println();
		Map<String, List<EmployeeEX>> employeeListByDepartment = employeeExList.stream()
				.collect(Collectors.groupingBy(EmployeeEX::getDepartment));
		Set<Entry<String, List<EmployeeEX>>> entrySet2 = employeeListByDepartment.entrySet();
		for (Entry<String, List<EmployeeEX>> entry2 : entrySet2) {
			System.out.println("--------------------------");
			System.out.println("Employees In->" + entry2.getKey() + " : ");
			System.out.println("--------------------------------");
			List<EmployeeEX> list = entry2.getValue();
			for (EmployeeEX e : list) {
				System.out.println(e.getName());
			}
		}

		// Query 3.13 : What is the average salary and total salary of the whole
		// organization?
		System.out.println();
		DoubleSummaryStatistics employeeSalaryStatitics = employeeExList.stream()
				.collect(Collectors.summarizingDouble(EmployeeEX::getSalary));
		System.out.println("Average Salary =" + employeeSalaryStatitics.getAverage());
		System.out.println("Total Salary =" + employeeSalaryStatitics.getSum());

		// Query 3.14 : Separate the employees who are younger or equal to 25 years from
		// those employees who are older than 25 years.

		System.out.println();

		Map<Boolean, List<EmployeeEX>> partitionEmployeesByAge = employeeExList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		Set<Entry<Boolean, List<EmployeeEX>>> entrySet3 = partitionEmployeesByAge.entrySet();
		for (Entry<Boolean, List<EmployeeEX>> entry3 : entrySet3) {
			System.out.println("--------------------------");
			if (entry3.getKey()) {
				System.out.println("Employees OlderThan 25 years :");
			} else {
				System.out.println("Emploees Younger Than or Equal to 25 Years : ");
			}
			System.out.println("---------------------------");
			List<EmployeeEX> list1 = entry3.getValue();
			for (EmployeeEX e1 : list1) {
				System.out.println(e1.getName() + "--" + e1.getAge());
			}
		}

		// Query 3.15 : Who is the oldest employee in the organization? What is his age
		// and which department he belongs to?

		System.out.println();
		System.out.println("Oldest Employee In this Organizatio->");
		Optional<EmployeeEX> oldestEmoloyeeWrapper = employeeExList.stream()
				.max(Comparator.comparingInt(EmployeeEX::getAge));
		EmployeeEX oldestEmployee = oldestEmoloyeeWrapper.get();
		System.out.println("Name :" + oldestEmployee.getName());
		System.out.println("Age :" + oldestEmployee.getAge());
		System.out.println("Deapartment :" + oldestEmployee.getDepartment());
		System.out.println("Salary : " + oldestEmployee.getSalary());

		// Query 3.16 :sorting the EmployeeEx based on the Name and Age
		System.out.println();
		System.out.println("Sorting on the Employee Name And Age");
		List<EmployeeEX> sortingEmloyeeEX = employeeExList.stream()
				.sorted(Comparator.comparing(EmployeeEX::getSalary).thenComparing(EmployeeEX::getName))
				.collect(Collectors.toList());

		for (EmployeeEX Ex1 : sortingEmloyeeEX) {
			System.out.println("Employee Name -" + Ex1.getName() + " , " + " Salary Is- " + Ex1.getSalary());

		}

		// Query 3.17 :sort the Employee based on the single value

		// employeeExList.stream().sorted(Comparator.comparing(EmployeeEx::getId)).collect(collectors.toList()));
		System.out.println();// map(EmployeeEX::getName Collectors.)

		Map<String, Long> A1 = employeeExList.stream().filter(e -> e.getAge() > 24)
				.collect(Collectors.groupingBy(EmployeeEX::getName, Collectors.counting()));

		Set<Entry<String, Long>> S = A1.entrySet();
		for (Entry<String, Long> E1 : S) {
			System.out.println(E1.getKey());
			Long LL = E1.getValue();
			// LL.getLong();
		}

		// System.out.println(A1);
		// sales And Marketing Employees and age
		Map<String, List<EmployeeEX>> Ab = employeeExList.stream()
				.filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(EmployeeEX::getName, Collectors.toList()));
		System.out.println();

		System.out.println("Sales And MArketing Employees and date of Joining Year");
		Set<Entry<String, List<EmployeeEX>>> Ab1 = Ab.entrySet();
		for (Entry<String, List<EmployeeEX>> L : Ab1) {

			List<EmployeeEX> E = L.getValue();
			for (EmployeeEX M : E) {
				System.out.println(L.getKey() + " --" + M.getYearOfJoining());
			}

		}
		// System.out.println(Ab);

		System.out.println();
		System.out.println("Employee Id and Employee Name");

		Map<Integer, String> listToMap = employeeExList.stream()
				.collect(Collectors.toMap(EmployeeEX::getId, EmployeeEX::getName));

		// System.out.println(listToMap);
		Set<Entry<Integer, String>> set1 = listToMap.entrySet();
		for (Entry<Integer, String> q : set1) {
			System.out.println("     " + q.getKey() + "-----" + q.getValue());
		}
		System.out.println();
		System.out.println("EmployeeEX Sorting based on Name and YearOfJoining");

		List<EmployeeEX> list1 = employeeExList.stream()
				.sorted(Comparator.comparing(EmployeeEX::getName).thenComparing(EmployeeEX::getYearOfJoining))
				.collect(Collectors.toList());

		for (EmployeeEX Ex : list1) {
			System.out.println(Ex.getName() + "----" + Ex.getYearOfJoining());
		}

		System.out.println();
		System.out.println("Sorting on Only Employee ID;");
		List<EmployeeEX> list2 = employeeExList.stream().sorted(Comparator.comparing(EmployeeEX::getId))
				.collect(Collectors.toList());

		for (EmployeeEX Ex1 : list2) {
			System.out.println(Ex1.getId() + "----" + Ex1.getName());
		}

		System.out.println();
		System.out.println("Iterating only One Id Person");
		Map<String, List<EmployeeEX>> map1 = employeeExList.stream().filter(e -> e.getId() == 244)
				.collect(Collectors.groupingBy(EmployeeEX::getName));
		// System.out.println(map1);

		Set<Entry<String, List<EmployeeEX>>> set2 = map1.entrySet();
		for (Entry<String, List<EmployeeEX>> s1 : set2) {
			System.out.println(s1.getKey());
		}

		System.out.println();
		System.out.println("Using Like Opeartor in Lamda Expression");
		System.out.println("  Name StartWith M");

		employeeExList.stream().filter(e -> e.getName().startsWith("M")).forEach(e -> {
			System.out.println(e.toString());
			// System.out.println("=================");
		});

		System.out.println();
		System.out.println("  Name Ends With Y");
		employeeExList.stream().filter(e -> e.getName().endsWith("y")).forEach(e -> {
			System.out.println(e.toString());
			// System.out.println("======================");
		});

		System.out.println();
		System.out.println("Search contains Sales And Marketing");

		employeeExList.stream().filter(e -> e.getDepartment().contains("Sales And Marketing")).forEach(e -> {
			System.out.println(e.getName() + "--" + e.getSalary());
		});

		System.out.println();
		System.out.println("Find Out MAX Salary In EmployeeEX class");
		EmployeeEX max = employeeExList.stream().max((p1, p2) -> (int) (p1.getSalary() - p2.getSalary())).get();
		System.out.println(max.getName() + "---" + max.getSalary());

		System.out.println();
		System.out.println("Find Out MIN Salary In EmployeeEX class");
		EmployeeEX min = employeeExList.stream().min((p1, p2) -> (int) (p1.getSalary() - p2.getSalary())).get();
		System.out.println(min.getName() + "---" + min.getSalary());

		System.out.println("Sorting based on salary descending order");

		// List<EmployeeEX>reverseOrder=employeeExList.stream().sorted(Comparator.comparingDouble(EmployeeEX::getSalary));
		// System.out.println(reverseOrder);

		Map<String, Optional<EmployeeEX>>  highestSalaryInEachDept=employeeExList.stream().collect(Collectors.groupingBy(EmployeeEX::getDepartment,
				Collectors.maxBy(Comparator.comparingDouble(EmployeeEX::getSalary))));
		Set<Entry<String, Optional<EmployeeEX>>> e =highestSalaryInEachDept.entrySet();
//		In Java 1.7
		System.out.println("Print All Departments in this Organization");
/*
		Set<String> uniqueValues = new HashSet<>();
		for (Employee employee : employeeList) {
		    String employeeDepartment = employee.getDepartment();
		    if (uniqueValues.add(employeeDepartment)) {
		        System.out.println(employeeDepartment);
		    }
		}
		In Java 1.8

		employeeList.stream(). map (Employee::getDepartment).distinct().forEach(System.out::println);
*/

		EmployeeEX secondHighestSalaryInPD=employeeExList.stream().filter(f->f.getDepartment()=="Product Developement")
        .sorted(Comparator.comparingDouble(EmployeeEX::getSalary).reversed()).skip(1).findFirst().get();
	}
}

/*

 */
