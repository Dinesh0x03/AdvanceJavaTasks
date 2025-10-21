package com.codegnan.Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Task3 {

	// delete multiple rows from user input
	static final String jdbc_Url = "jdbc:mysql://localhost:3306/springboot";
	static final String user_name = "root";
	static final String password = "";

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(jdbc_Url, user_name, password);
				Statement st = con.createStatement()) {

			Scanner SC = new Scanner(System.in);
			
			
			System.out.println("Enter no.of records to be deleted:");
			int n = SC.nextInt(); 
			
			int rows_effected=0;
			
			for(int i=0;i<n;i++) {
				System.out.println("enter the employee number to be deteted:");
				int input = SC.nextInt();
				
				String query = "DELETE FROM EMPLOYEE WHERE ENO='" + input + "';";
				st.executeUpdate(query);
				
				System.out.println("operation successfull!");
				rows_effected++;
			}

			
			System.out.println(rows_effected + " rows effected!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
