package com.sonata.casestudy;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	 			Class.forName("com.mysql.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");
	 			 CallableStatement cs = con.prepareCall("{call Doctor(?,?,?,?,?)}");
	 			 cs.setInt(1, 1234);
	 			 cs.setString(2,"DR Umesh");
	 			 cs.setString(3,"Ortho");
	 			cs.setString(4,"umesh@gmail.com");
	 			cs.setString(5,"998799999");
	 			 
	 			
	 			
	 			
	 			 int rs = cs.executeUpdate();
	 			 System.out.println("The number of records inserted is "+rs);
	 			 
	 			
	 			 
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
	}
}






