package com.dao;

public class StudentDaoFactory {

	public static StudentDao getStudentDao() {
		return new StuentDaoImpl();
	}

}
