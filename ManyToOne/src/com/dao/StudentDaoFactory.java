package com.dao;

public class StudentDaoFactory {

	public static StudentDao geStudentDao() {
		return new StudentDaoImp();
	}

}
