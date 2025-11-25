package com.dao;

import java.util.List;

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

	public void updateEmployee(Employee employee) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			tx = session.beginTransaction();
			session.update(employee); //
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

	}

	public void deleteEmployee(Employee employee) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			tx = session.beginTransaction();
			session.delete(employee); //
			tx.commit();

		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

	}

	public Employee getEmployeeById(Integer id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			return session.get(Employee.class, id); //

		} catch (Exception e) {
			throw e;
		}
	}

	public List<Employee> getAllEmployee() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			String hql = "from Employee e";
			return session.createQuery(hql, Employee.class).list();
		} catch (Exception e) {
			throw e;
		}
	}

}
