package com.sonata.Dao;


import java.sql.SQLException;

public class TestBeanPat_Feedback {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
Pat_Feedback  e1 = new Pat_Feedback ();
e1.setDr_id(1295);
e1.setPat_id(48);
e1.setFeedback("Good");
e1.setFeedback_id(67);
e1.setDate(04/04/2020);


Pat_FeedbackDaoImpl dao = new Pat_FeedbackDaoImpl();
	int row = dao.save(e1);
	
	//update
	//int row = dao.update(e1);
	
	//delete
	//int row = dao.delete(e1);
	System.out.println(row);
	
	}

}



