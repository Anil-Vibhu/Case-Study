package com.sonata.Dao;


	import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
	
	import java.sql.SQLException;






	public class DocLoginDAOImpl implements DocLoginDao {
		
		int row = 0;
		DbConnection db = new DbConnection();
		DocLogin doclogin = null;
		
		
		public int save(Object object) throws ClassNotFoundException {
		//public int update(Object object) {
			//public int delete(Object object);{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");
				doclogin = (DocLogin)object;
				 CallableStatement cs = con.prepareCall("{call DocLogin(?,?)}");
				cs.setInt(1, doclogin.getDr_id());
				cs.setString(2, doclogin.getPassword());
				
			
				
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
		
		
				
				
				
				
				
