package com.sonata.OtherJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	 			Class.forName("com.mysql.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root","admin@123");
	 			 //CallableStatement cs = con.prepareCall("{call SAVE(?,?,?,?,?)}");
	 			 //cs.setInt(1, 322);
	 			 //cs.setString(2,"execution");
	 			 //cs.setDouble(3,3456.0);
	 			 
	 			
	 			//CallableStatement cs = con.prepareCall("{call UPDATEEMP1(?,?)}");
	 				//	cs.setInt(1, 322);
	 					//cs.setString(2, "Yash");

	 			CallableStatement cs = con.prepareCall("{call DeleteEmp1(?)}");
	 			cs.setInt(1, 322);
	 			
	 			 int rs = cs.executeUpdate();
	 			 //System.out.println("The number of records inserted is "+rs);
	 			 
	 			System.out.println("The number of records updated is "+rs);
	 			 
	}catch(ClassNotFoundException e1) {System.out.println(e1);}
			catch(SQLException e2) {e2.printStackTrace();}
	}
}

