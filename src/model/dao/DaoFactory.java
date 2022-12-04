package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDaoJDBC creatSellerDao() {
		return new SellerDaoJDBC();	
	}
}
