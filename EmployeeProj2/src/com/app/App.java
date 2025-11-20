package com.app;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setName("Raju");
		employee.setSalary(11111);
		
		EmployeeDao dao=new EmployeeDaoImpl();
		dao.saveEmployee(employee);
		
		System.out.println("(((((()))))))");
		
		
	}
	
}
