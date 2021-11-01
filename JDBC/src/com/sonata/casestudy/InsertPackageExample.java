package com.sonata.casestudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Online_Consultation", "root","admin@123");

PreparedStatement ps = con.prepareStatement("insert into Patient values(?,?,?,?,?,?,?)");
ps.setInt(1,123);
ps.setString(2,"Anil");
ps.setInt(3,21);
ps.setString(4,"M");
ps.setString(5,"avibhu@gmail.com");
ps.setString(6,"6360419303");
ps.setString(7,"A+");
int a = ps.executeUpdate();
System.out.println("The number of records updated are"+a);
}catch(ClassNotFoundException e1) {System.out.println(e1);}
catch(SQLException e2) {e2.printStackTrace();}

	}

}
