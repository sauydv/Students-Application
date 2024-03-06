package com.student_app.Model;

public interface DAOService {

	public void connectDB();
	public boolean singup(String username, String password, String email);
}
