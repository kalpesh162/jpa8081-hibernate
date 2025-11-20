package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class ReadData {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		// Employee employee = (Employee) session.get(Employee.class, 2);
		// Employee employee = (Employee) session.get(Employee.class, 3);
		Employee employee = (Employee) session.load(Employee.class, 3);

		//System.out.println(employee);

		session.close();

		factory.close();

	}

}
