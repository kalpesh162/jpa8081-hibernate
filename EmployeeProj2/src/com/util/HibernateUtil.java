package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;

	private HibernateUtil() {
	}

	public static SessionFactory getSessionFactory() {
		if (factory != null)
			return factory;

		return factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	}

	public static void close() {
		factory.close();
	}

}
