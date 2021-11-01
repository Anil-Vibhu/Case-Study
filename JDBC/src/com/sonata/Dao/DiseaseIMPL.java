package com.sonata.Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



	public class DiseaseIMPL {



		
		int row = 0;
		DbConnection db = new DbConnection();
		Disease disease = null;
		
		
		public int save(Object object)  {
		//public int update(Object object) {
			//public int delete(Object object);{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");
				disease = (Disease)object;
				 CallableStatement cs = con.prepareCall("{call Disease1(?,?)}");
				cs.setInt(1, disease.getDis_id());
				cs.setString(2, disease.getDis_name());
				
				
			
				
				//PreparedStatement cs = db.getConnection().prepareStatement("update Patient set phone_number =? where pat_id=?");
			    //cs.setString(1, "9742053206");
				//cs.setInt(2, 123);
				
				
				//PreparedStatement cs = con.prepareStatement("delete from Patient where pat_id=?");
	            //cs.setInt(1, 123);
			row = cs.executeUpdate();
			//db.closeConnection();
			
			
		}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
			return row;
	}
		}



