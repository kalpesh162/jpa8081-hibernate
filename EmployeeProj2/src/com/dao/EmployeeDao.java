package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(int id);

	Employee getEmployeeById(int id);

	List<Employee> getAllEmployees();

}
