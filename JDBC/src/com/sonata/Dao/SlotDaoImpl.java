package com.sonata.Dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

	import java.sql.SQLException;






	public class SlotDaoImpl  implements SLOTDAO {
		
		int row = 0;
		DbConnection db = new DbConnection();
		Slot slot = null;
		
		
		public int save(Object object)  {
		//public int update(Object object) {
			//public int delete(Object object);{
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");
				slot = (Slot)object;
				 CallableStatement cs = con.prepareCall("{call Slot(?,?,?,?,?)}");
				cs.setInt(1, slot.getDoc_id());
				cs.setInt(2, slot.getPat_id());
				cs.setInt(3, slot.getDis_id());
				cs.setInt(4, slot.getDate());
				cs.setInt(5,slot.getSlot_id());
				
			
				
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
		
		
			



