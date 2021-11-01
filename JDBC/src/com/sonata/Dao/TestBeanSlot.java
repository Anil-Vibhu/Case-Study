package com.sonata.Dao;

import java.sql.SQLException;

public class TestBeanSlot {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
Slot e1 = new Slot();
e1.setDoc_id(3456);
e1.setPat_id(3348);
e1.setDis_id(12);
e1.setDate(04/04/2020);
e1.setSlot_id(67);

SlotDaoImpl dao = new SlotDaoImpl();
	int row = dao.save(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	}

}


