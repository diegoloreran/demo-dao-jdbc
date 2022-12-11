package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDaoJDBC creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());	
	}

	public static DepartmentDao createDepartmentDao() {
		// TODO Auto-generated method stub
		return null;
	}
}
