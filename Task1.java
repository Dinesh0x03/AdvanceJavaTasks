package com.codegnan.Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {
	//Delete single record without end user values.

	static final String jdbc_Url = "jdbc:mysql://localhost:3306/springboot";
	static final String user_name = "root";
	static final String password = "4876";
	
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(jdbc_Url,user_name,password);
				Statement st = con.createStatement()){
			
			int eno = 789;
			String query = "DELETE FROM EMPLOYEE WHERE ENO='"+eno+"';";
			
			if(st.executeUpdate(query)==1) {
				System.out.println("record successfully deleted!");
			}else {
				System.out.println("deletion failed.");
			}
					
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
