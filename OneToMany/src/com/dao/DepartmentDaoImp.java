package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Department;
import com.util.HibernateUtil;

public class DepartmentDaoImp implements DepartmentDao {

	@Override
	public void saveDepartment(Department department) {
		Transaction tx = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.save(department);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();

			throw e;
		}

	}

}
