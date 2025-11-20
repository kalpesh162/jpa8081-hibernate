package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Kalpesh");
		employee.setSalary(10000);

		session.update(employee); // saveorupdate()

		tx.commit();

		session.close();

		factory.close();
	}

}
