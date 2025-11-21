package com.app;

import java.util.List;

import com.dao.EmployeeDAOFactory;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setName("Raju");
		employee.setSalary(11111);
		
//		EmployeeDao dao=new EmployeeDaoImpl();
		
		EmployeeDao dao=EmployeeDAOFactory.getEmployeeDao();
		dao.saveEmployee(employee);
		
		System.out.println("(((((()))))))");
		
		System.out.println("-----------------");
		
		System.out.println(dao.getAllEmployeesNames());
	
		System.out.println("--------------------------");
		
		List<Object[]> list=dao.getAllNameAndSalaryEmployeesNames();
		System.out.println("____________________________________");
		for(Object [] arr :list) {
			
			System.out.println(arr[0] +"  "+arr[1]);
			
		}
		
	}
	
}
