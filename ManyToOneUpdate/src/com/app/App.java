package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Student;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Department csDept = new Department("IT");
		Department mathDept = new Department("Physics");

		// Create students and assign departments
		Student student1 = new Student("Sneha", csDept);
		Student student2 = new Student("Snehal", csDept);
		Student student3 = new Student("Sunil", mathDept);

		// Start transaction
		Transaction tx = session.beginTransaction();

		// Save departments first
		session.persist(csDept);
		session.persist(mathDept);

		// Save students
		session.persist(student1);
		session.persist(student2);
		session.persist(student3);

		tx.commit();

		System.out.println("!!!!!!!!!!");

	}

}
