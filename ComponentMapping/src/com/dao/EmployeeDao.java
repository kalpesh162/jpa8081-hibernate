package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);

	Employee getEmployeeById(Integer id);

	List<Employee> getAllEmployee();

}
