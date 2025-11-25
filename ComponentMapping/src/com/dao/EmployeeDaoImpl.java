package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee(Employee employee) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			tx = session.beginTransaction();
			session.save(employee); //
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

	}

}
