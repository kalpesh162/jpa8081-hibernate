package com.app;

import com.dao.DepartmentDao;
import com.dao.DepartmentFactory;
import com.entity.Department;
import com.entity.Student;

public class App {

	public static void main(String[] args) {

		Department department1 = new Department();
		department1.setName("Comp");

		Department department2 = new Department();
		department2.setName("Mechanical");

		Student student1 = new Student();
		student1.setName("Kalpesh");
		Student student2 = new Student();
		student2.setName("Kareena");
		Student student3 = new Student();
		student3.setName("Raveena");
		Student student4 = new Student();
		student4.setName("Suraj");

		// Add Student to Department
		department1.getStudList().add(student1);
		department1.getStudList().add(student2);
		department1.getStudList().add(student3);

		department2.getStudList().add(student4);

		DepartmentDao departmentDao = DepartmentFactory.geDepartmentDao();

		departmentDao.saveDepartment(department1);
		departmentDao.saveDepartment(department2);

		
		System.out.println("**********");
	}

}
