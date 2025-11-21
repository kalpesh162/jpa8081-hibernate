package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee(Employee employee) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			tx = session.beginTransaction();

			session.save(employee);

			tx.commit();

		} catch (Exception e) {

			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		Transaction tx = null;
		try (SessionFactory factory = HibernateUtil.getSessionFactory(); Session session = factory.openSession()) {

			tx = session.beginTransaction();

			session.update(employee);

			tx.commit();

		} catch (Exception e) {

			if (tx != null) {
				tx.rollback();
			}
			throw e;

		}

	}

	@Override
	public void deleteEmployee(int id) {
		Transaction tx = null;
		try (SessionFactory factory = HibernateUtil.getSessionFactory(); Session session = factory.openSession()) {

			tx = session.beginTransaction();
			Employee employee = new Employee();
			employee.setId(id);
			session.delete(employee);

			tx.commit();

		} catch (Exception e) {

			if (tx != null) {
				tx.rollback();
			}
			throw e;

		}

	}

	@Override
	public Employee getEmployeeById(int id) {

		try (SessionFactory factory = HibernateUtil.getSessionFactory(); Session session = factory.openSession()) {

			return session.get(Employee.class, id);

		} catch (Exception e) {

			throw e;

		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		String hql = "FROM Employee e";
		try (SessionFactory factory = HibernateUtil.getSessionFactory(); Session session = factory.openSession()) {

			Query query = session.createQuery(hql, Employee.class);

			return query.list();

		} catch (Exception e) {

			throw e;

		}
	}

	@Override
	public List<String> getAllEmployeesNames() {
		String hql = "SELECT name FROM Employee e";
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Query<String> query = session.createQuery(hql);

			return query.list();

		} catch (Exception e) {

			throw e;

		}
	}

	@Override
	public List<Object[]> getAllNameAndSalaryEmployeesNames() {
		String hql = "SELECT name,salary FROM Employee e";
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Query<Object[]> query = session.createQuery(hql);

			return query.list();

		} catch (Exception e) {

			throw e;

		}
	}

}
