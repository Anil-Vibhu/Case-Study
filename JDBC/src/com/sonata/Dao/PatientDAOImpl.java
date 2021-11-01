package com.sonata.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;






public class PatientDAOImpl implements PatientDao {
	int row = 0;
	DbConnection db = new DbConnection();
	Patient patient = null;
	
	
	public int save(Object object) throws ClassNotFoundException {
	//public int update(Object object) {
		//public int delete(Object object);{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");
			patient = (Patient)object;
			
			
			 CallableStatement cs = con.prepareCall("{call Patient(?,?,?,?,?,?,?)}");
			//PreparedStatement cs = db.getConnection().prepareStatement("insert into Patient values(?,?,?,?,?,?,?)");
			cs.setInt(1, patient.getPat_id());
			cs.setString(2, patient.getName());
			cs.setInt(3, patient.getAge());
			cs.setString(4, patient.getSex());
			cs.setString(5, patient.getEmail());
			cs.setString(6, patient.getPhone_number());
			cs.setString(7, patient.getBlood_group());
			
			//PreparedStatement cs = db.getConnection().prepareStatement("update Patient set phone_number =? where pat_id=?");
		    //cs.setString(1, "9742053206");
			//cs.setInt(2, 123);
			
			
			//PreparedStatement cs = con.prepareStatement("delete from Patient where pat_id=?");
            //cs.setInt(1, 123);
		row = cs.executeUpdate();
		db.closeConnection();
		
		
	}catch(SQLException e) {System.out.println(e);}
		return row;
	}


	@Override
	public List<Patient> getData() {
		// TODO Auto-generated method stub
		return null;
	}
	
//@Override

//public List<Patient> getData(){
	//List<Patient> patList = new ArrayList<>();
	//try {
		
//		PreparedStatement cs1 = db.getConnection().prepareStatement("select * from Patient");
	//	ResultSet rs = cs1.executeQuery();
		//while(rs.next()) {
			//Patient pat = new Patient();
			//pat.setPat_id(rs.getInt("pat_id"));
//			pat.setName(rs.getString("name"));
	//		pat.setAge(rs.getInt("age"));
		//	pat.setSex(rs.getString("sex"));
			//pat.setPhone_number(rs.getString("phone_number"));
		//	pat.setBlood_group(rs.getString("blood_group"));
			
			
			//int Pat_id = rs.getInt(1);
			//String name = rs.getString(2);
			//int age = rs.getInt(3);
			//String sex = rs.getString(4);
			//String email = rs.getString(5);
			//String phone_number = rs.getString(6);
			//String blood_group = rs.getString(7);
			//patList.add(pat);
			//int rs = pat.executeUpdate();
			//db.closeConnection();
			
			
		//}catch(ClassNotFoundException e1) {System.out.println(e1);}
			//catch(SQLException e2) {e2.printStackTrace();}
			//return row;
			
			
		}
	


