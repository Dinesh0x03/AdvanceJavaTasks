package com.codegnan.Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Task2 {
	
	// delete single row using user given values
	static final String jdbc_Url = "jdbc:mysql://localhost:3306/springboot";
	static final String user_name = "root";
	static final String password = "";
	
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(jdbc_Url,user_name,password);
		Statement st = con.createStatement()){
			
			Scanner SC = new Scanner(System.in);
			System.out.println("enter the employee number to be deteted:");
			int input = SC.nextInt();
			
			String query = "DELETE FROM EMPLOYEE WHERE ENO='"+input+"';";
			
			int rows_effected = st.executeUpdate(query);
			
			System.out.println(rows_effected+" rows effected!");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
