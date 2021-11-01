package com.sonata.Dao;


	
	import java.sql.SQLException;

	public class TestBeanPrescription {

		public static void main(String[] args) throws SQLException, ClassNotFoundException{
			// TODO Auto-generated method stub
			Prescription e1 = new Prescription();
	e1.setSlot_id(11);
	e1.setPrescription("Dolo 650");


	PrescriptionDaoImpl dao = new PrescriptionDaoImpl();
		int row = dao.save(e1);
		
		//update
		//int row = dao.update(e1);
		
		//delete
		//int row = dao.delete(e1);
		System.out.println(row);
		
		}

	}

	
