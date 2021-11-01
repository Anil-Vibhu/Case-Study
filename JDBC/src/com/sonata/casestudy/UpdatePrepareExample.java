package com.sonata.casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrepareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");

PreparedStatement ps = con.prepareStatement("update Patient set phone_number =? where pat_id=?");
ps.setString(1, "9742053206");
ps.setInt(2, 123);

int a = ps.executeUpdate();
System.out.println("The number of rec updated are" + a);
}catch(ClassNotFoundException e1) {System.out.println(e1);}
catch(SQLException e2) {e2.printStackTrace();}
	}

}
