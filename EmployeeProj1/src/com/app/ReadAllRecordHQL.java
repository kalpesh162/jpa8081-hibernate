package com.app;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class ReadAllRecordHQL {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		String hql = "from Employee e";

		Query query = session.createQuery(hql, Employee.class);

		List<Employee> empList = query.list();

		System.out.println("--------");
		Iterator<Employee> itr = empList.iterator();

		while (itr.hasNext()) {
			Employee employee = itr.next();
			System.out.print(employee.getId() + "  ");
			System.out.print(employee.getName() + "  ");
			System.out.println(employee.getSalary());
		}

		session.close();
		factory.close();

	}

}
