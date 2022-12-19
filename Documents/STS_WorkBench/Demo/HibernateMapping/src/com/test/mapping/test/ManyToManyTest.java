package com.test.mapping.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.mapping.model.Course;
import com.test.mapping.model.Student;
import com.test.mapping.util.HibernateUtill;

public class ManyToManyTest {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			Session session = HibernateUtill.getSession();
			tx = HibernateUtill.getTransaction();
			
			
			Student std=new Student();
			std.setStdId(100);
			std.setStdName("veeru");
			Student std2=new Student();
			std2.setStdId(200);
			std2.setStdName("SNRaju");
			Student std3=new Student();
			std3.setStdId(300);
			std3.setStdName("Lasya");
			Set<Student> students= new HashSet<>();
			students.add(std);
			students.add(std2);
			students.add(std3);
			
			
			Course c1=new Course();
			c1.setCid(100);
			c1.setCname("Java");
			c1.setStudents(students);
			
			Course c2=new Course();
			c1.setCid(200);
			c2.setCname("Hibernate");
			c2.setStudents(students);
			
			Course c3=new Course();
			c1.setCid(300);
			c3.setCname("Spring");
			c3.setStudents(students);
			
			Set<Course> courses=new HashSet<>();
			courses.add(c1);
			courses.add(c2);
			courses.add(c3);
			
			
			Student student=new Student();
			student.setStdId(100);
			student.setStdName("Veeru");
			student.setCourses(courses);
			session.save(student);    
			session.save(c1);  
			session.save(c2); 
			session.save(c3); 
			
			System.out.println("Updated the Data successfully");
			
			HibernateUtill.commitTransaction();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

}
