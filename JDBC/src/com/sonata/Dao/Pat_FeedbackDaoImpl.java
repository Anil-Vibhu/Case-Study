package com.sonata.Dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;






	public class Pat_FeedbackDaoImpl   implements Pat_FeedbackDAO {
		
		int row = 0;
		DbConnection db = new DbConnection();
		Pat_Feedback patient_feedback = null;
		
		
		public int save(Object object)  {
		//public int update(Object object) {
			//public int delete(Object object);{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");
	 			patient_feedback = (Pat_Feedback)object;
				 CallableStatement cs = con.prepareCall("{call Pat_Feedback(?,?,?,?,?)}");
				cs.setInt(1, patient_feedback.getDr_id());
				cs.setInt(2, patient_feedback.getPat_id());
				cs.setString(3, patient_feedback.getFeedback());
				cs.setInt(4, patient_feedback.getFeedback_id());
				cs.setInt(5,patient_feedback.getDate());
				
			
				
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
		
		
			




