package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// Create students
		Student student1 = new Student("amisha", "amisha@example.com");
		Student student2 = new Student("rekha", "rekha@example.com");

		// Create courses
		Course course1 = new Course("C Programming", "CS555", 3);
		Course course2 = new Course("Data Structure", "CS123", 4);

		// Enroll students in courses
		student1.addCourse(course1);
		student1.addCourse(course2);
		student2.addCourse(course1);

		// Start transaction
		session.beginTransaction();

		session.save(student1);
		session.save(student2);
		session.save(course1);
		session.save(course2);
		// Commit transaction
		session.getTransaction().commit();

		System.out.println("*****  Thanks ****");
	}

}
