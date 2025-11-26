package com.dao;

public class DepartmentFactory {

	public static DepartmentDao geDepartmentDao() {
		return new DepartmentDaoImp();
	}

}
