package com.studentapp.model;

import java.sql.ResultSet;

public interface DAOService {
	public void connectDB();
	public boolean verifyCredentials(String email, String password);
	public void saveRegistration(String name, String city, String email, String mobile);
	public ResultSet getALLReg();
	public void deleteByEmail(String email);
	public void updateReg(String email, String mobile);

}
