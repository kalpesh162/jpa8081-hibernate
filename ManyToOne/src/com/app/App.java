package com.app;

import com.dao.StudentDao;
import com.dao.StudentDaoFactory;
import com.entity.Department;
import com.entity.Student;

public class App {

	public static void main(String[] args) {

		Department department1 = new Department();
		department1.setName("IT");

		Department department2 = new Department();
		department2.setName("Mechanical");

		Student student1 = new Student();
		student1.setName("Arjun");
		student1.setDepartment(department1);
		Student student2 = new Student();
		student2.setName("Amitabh");
		student2.setDepartment(department1);
		Student student3 = new Student();
		student3.setName("Sandesh");
		student3.setDepartment(department1);
		Student student4 = new Student();
		student4.setName("Kunal");
		student4.setDepartment(department2);
		StudentDao dao = StudentDaoFactory.geStudentDao();
		dao.saveStudent(student1);
		dao.saveStudent(student2);
		dao.saveStudent(student3);
		dao.saveStudent(student4);

		System.out.println("**********");
	}

}
