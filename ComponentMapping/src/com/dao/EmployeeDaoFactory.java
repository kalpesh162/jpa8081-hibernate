package com.dao;

public class EmployeeDaoFactory {

	public static EmployeeDao getEmployeeDao() {
		return new EmployeeDaoImpl();
	}

}
