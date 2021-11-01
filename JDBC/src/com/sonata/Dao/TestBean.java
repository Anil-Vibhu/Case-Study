package com.sonata.Dao;

import java.sql.SQLException;
//import java.util.List;

public class TestBean {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
Patient e1 = new Patient();
e1.setPat_id(123);
e1.setName("Anil");
e1.setAge(21);
e1.setSex("M");
e1.setEmail("avibhu@gmail.com");
e1.setPhone_number("9742053206");
e1.setBlood_group("A+");
	PatientDAOImpl dao = new PatientDAOImpl();
	int row = dao.save(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	//List<Patient> list = dao.getData();
	//for(Patient e : list) {
		//System.out.println(e.getPat_id());
		//System.out.println(e.getName());
//		System.out.println(e.getAge());
	//	System.out.println(e.getSex());
		//System.out.println(e.getEmail());
//		System.out.println(e.getPhone_number());
	//	System.out.println(e.getBlood_group());
	}
	
	}

//}
