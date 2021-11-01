package com.sonata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RetriveImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root","admin@123");
	
	PreparedStatement ps = con.prepareStatement("select * from image");
	File file = new File("D:/Documents/Qr code/im21.jpg");
	FileOutputStream fos = new FileOutputStream(file);
	
	byte b[];
	Blob blob;
	
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		blob = rs.getBlob("im");
		b=blob.getBytes(1, (int)blob.length());
		fos.write(b);
	}

ps.close();
fos.close();
con.close();

}catch(ClassNotFoundException e) {System.out.println(e);}
catch(SQLException e1) {System.out.println(e1);}
catch(IOException e2) {System.out.println(e2);}

}
	}


