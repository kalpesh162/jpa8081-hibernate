package com.dao;

public class EmployeeDAOFactory {

	public static EmployeeDao getEmployeeDao() {
		return new EmployeeDaoImpl();
	}
	
	
}
