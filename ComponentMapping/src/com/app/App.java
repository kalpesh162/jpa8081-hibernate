package com.app;

import java.util.EmptyStackException;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoFactory;
import com.entity.Address;
import com.entity.Employee;

public class App {

	public static void main(String[] args) {

		Address address = new Address();
		address.setLandMark("Warje Bridge");
		address.setState("MH");
		address.setCity("PUNE");
		address.setPincode(411058);

		Employee employee = new Employee();
		employee.setName("Kalpesh");
		employee.setSalary(10000.0);

		employee.setAddress(address);

		EmployeeDao employeeDao = EmployeeDaoFactory.getEmployeeDao();

		employeeDao.saveEmployee(employee);

		System.out.println("!!!!!!!!");

	}

}
