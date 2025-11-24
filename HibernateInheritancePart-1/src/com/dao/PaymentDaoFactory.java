package com.dao;

public class PaymentDaoFactory {

	public static PaymentDao getPaymentDao() {
		return new PaymentDaoImpl();
	}

}
