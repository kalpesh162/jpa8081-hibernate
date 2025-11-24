package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Payment;
import com.util.HibernateUtil;

public class PaymentDaoImpl implements PaymentDao {

	@Override
	public void save(Payment payment) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			tx = session.beginTransaction();
			session.save(payment);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			throw e;
		}
	}

}
