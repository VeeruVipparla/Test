package com.test.hql;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.m2m.exmp.Course;
import com.m2m.exmp.Student;
import com.test.mapping.util.HibernateUtill;

public class M2M_Test {

	public static void main(String[] args) {

		Transaction tx = null;
		try {
			Session session = HibernateUtil.getSession();
			tx = HibernateUtil.getTransaction();

			Student std = new Student();
			std.setSid(100);
			std.setsName("veeru");
			Student std2 = new Student();
			std2.setSid(200);
			std2.setsName("SNRaju");
			Student std3 = new Student();
			std3.setSid(300);
			std3.setsName("Lasya");
			Set<Student> students = new HashSet<>();
			students.add(std);
			students.add(std2);
			students.add(std3);

			Course c1 = new Course();
			c1.setcId(100);
			c1.setcName("Java");
			c1.setStudents(students);

			Course c2 = new Course();
			c1.setcId(200);
			c2.setcName("Hibernate");
			c2.setStudents(students);

			Course c3 = new Course();
			c1.setcId(300);
			c3.setcName("Spring");
			c3.setStudents(students);

			Set<Course> courses = new HashSet<>();
			courses.add(c1);
			courses.add(c2);
			courses.add(c3);

			Student student = new Student();
			student.setSid(100);
			student.setsName("Veeru");
			student.setCourse(courses);
			session.save(student);
			session.save(c1);
			session.save(c2);
			session.save(c3);

			System.out.println("Updated the Data successfully");

			HibernateUtill.commitTransaction();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

}

/*
 * Transaction tx = null; Session session = HibernateUtill.getSession(); tx =
 * HibernateUtill.getTransaction();
 * 
 * Student std = new Student(); std.setSid(1); std.setsName("Veeru");
 * 
 * Set<Student> students = new HashSet<>();
 * 
 * students.add(std);
 * 
 * Course c = new Course(); c.setcId(100); c.setcName("java");
 * 
 * Set<Course> courses = new HashSet<>(); courses.add(c);
 * 
 * std.setCourse(courses);
 * 
 * session.save(std); session.save(c);
 * 
 * session.getTransaction().commit();
 * 
 * }
 * 
 * }
 */