package com.sonata.Dao;

import java.sql.SQLException;

public class TestBean3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
PatLogin e1 = new PatLogin();
e1.setP_id(123);
e1.setPassword(" ***** ");


PatLoginIMPL dao = new PatLoginIMPL();
	int row = dao.save(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	}

}



