package com.sonata.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;

import java.sql.SQLException;





public class Doctor1DAOImpl implements Doctor1Dao {
	int row = 0;
	DbConnection db = new DbConnection();
	Doctor1 doctor = null;
	
	
	public int save1(Object object)  {
	//public int update(Object object) {
		//public int delete(Object object);{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");
			doctor = (Doctor1)object;
			 CallableStatement cs = con.prepareCall("{call DOC(?,?,?,?,?)}");
			//PreparedStatement cs = db.getConnection().prepareStatement("insert into Doctor1 values(?,?,?,?,?)");
			cs.setInt(1, doctor.getDoc_id());
			cs.setString(2, doctor.getDname());
			cs.setString(3, doctor.getSpecialization());
			cs.setString(4, doctor.getE_mail());
			cs.setString(5, doctor.getPh_number());
			
			
			//PreparedStatement cs = db.getConnection().prepareStatement("update Doctor1 set ph_number =? where doc_id=?");
		    //cs.setString(1, "6360497688");
			//cs.setInt(2, 123);
			
			
			//PreparedStatement cs = con.prepareStatement("delete from Doctor1 where doc_id=?");
            //cs.setInt(1, 123);
		row = cs.executeUpdate();
		//db.closeConnection();
		
		
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
		catch(SQLException e2) {e2.printStackTrace();}
		return row;
//	}


	//@Override
	//public int save(Object object) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//return 0;
	}


	//@Override
	//public int save(Object object) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//return 0;
	}



