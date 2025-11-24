package com.app;

import java.time.LocalDate;

import com.dao.PaymentDao;
import com.dao.PaymentDaoFactory;
import com.entity.Cheque;
import com.entity.CreditCard;
import com.entity.Payment;

public class App {
	
	public static void main(String[] args) {
		
		CreditCard card1=new CreditCard();
		card1.setPayDate(LocalDate.now());
		card1.setPayAmt(10000);
		card1.setCardNum(12345678);
		card1.setCardType("VISA");
		
		
		Cheque ch1=new Cheque();
		ch1.setPayDate(LocalDate.now());
		ch1.setPayAmt(1000);
		ch1.setChequeNo(87654321);
		ch1.setChequeType("OPEN");
		
		PaymentDao paymentDao=PaymentDaoFactory.getPaymentDao();
		paymentDao.save(card1);
		paymentDao.save(ch1);

		System.out.println("*********");
		
		
		
	}

}
