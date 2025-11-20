package com.app;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.entity.Employee;

public class ReadAllData {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		// mysql
		String sql = "Select * from empinfo";

		NativeQuery query = session.createNativeQuery(sql, Employee.class);

		List<Employee> empList = query.list();

		System.out.println(empList);

		System.out.println("--------");
		Iterator<Employee> itr = empList.iterator();

		while (itr.hasNext()) {
			Employee employee = itr.next();
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
		}

		session.close();

		factory.close();
	}

}
