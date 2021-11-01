package com.sonata.Dao;
import java.sql.SQLException;

public class TestBeanDoctor2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
Doctor2 e1 = new Doctor2();
e1.setDr_id(49);
e1.setDr_name("Nikhil");
e1.setSpecialization("Ortho");
e1.setEmail("nikhil@gmail.com");
e1.setPh_no("99999767");


Doctor2DaoImpl dao = new Doctor2DaoImpl();
	int row = dao.save(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	}

}







