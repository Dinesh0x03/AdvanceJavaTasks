package com.codegnan.Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task4 {

	// UPDATE SINGLE RECORD WITHOUT END USER VALUES
	
	static final String url = "jdbc:mysql://localhost:3306/springboot";
	static final String user_name = "root";
	static final String password = "4876";

	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection(url,user_name,password);
				Statement st = con.createStatement()){
			
			String query = "UPDATE EMPLOYEE SET ESAL=40000 WHERE ENAME='VINAYAK'";
			
			st.executeUpdate(query);
			
			System.out.println("updation successfull.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
