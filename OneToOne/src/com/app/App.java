package com.app;

import com.dao.StudentDao;
import com.dao.StudentDaoFactory;
import com.entity.Address;
import com.entity.Student;

public class App {

	public static void main(String[] args) {

		Address address = new Address();
		address.setState("MH");
		address.setCity("PUNE");

		Student student = new Student();
		student.setName("KALPESH");

		student.setAddress(address);

		StudentDao studentDao = StudentDaoFactory.getStudentDao();

		studentDao.saveStudent(student);

		System.out.println("**********");

	}

}
