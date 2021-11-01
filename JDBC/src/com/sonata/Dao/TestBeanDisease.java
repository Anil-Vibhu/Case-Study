package com.sonata.Dao;

import java.sql.SQLException;

public class TestBeanDisease {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
Disease e1 = new Disease();
e1.setDis_id(69);
e1.setDis_name("Dengue");


DiseaseIMPL dao = new DiseaseIMPL();
	int row = dao.save(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	}

}


