package com.sonata.Dao;

import java.sql.SQLException;

public class TestBean1 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
Doctor1 e1 = new Doctor1();
e1.setDoc_id(123);
e1.setDname("Anil");
e1.setSpecialization("Cardiologist");
e1.setE_mail("avibhu@gmail.com");
e1.setPh_number("9742053206");

	Doctor1DAOImpl dao = new Doctor1DAOImpl();
	int row = dao.save1(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	}

}


