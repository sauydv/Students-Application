package com.student_app.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DAOServiceImpl implements DAOService{
    private Connection con;
	private Statement stmnt;
	@Override
		public void connectDB() {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","S@2468yadav");
			stmnt = con.createStatement();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	@Override
	public boolean singup(String username, String password, String email) {
		try {
			stmnt.executeUpdate("insert into students values('"+username+"','"+password+"','"+email+"");
		    } catch (Exception e) {
				e.printStackTrace();
			}
		return false;
	    }
		
}
