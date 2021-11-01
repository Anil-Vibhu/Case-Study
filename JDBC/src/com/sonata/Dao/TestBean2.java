package com.sonata.Dao;

import java.sql.SQLException;

public class TestBean2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
DocLogin e1 = new DocLogin();
e1.setDr_id(123);
e1.setPassword(" ***** ");


	DocLoginDAOImpl dao = new DocLoginDAOImpl();
	int row = dao.save(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	}

}

