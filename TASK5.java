package com.codegnan.Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TASK5 {

	// UPDATE SINGLE USER RECORD WITH END USER INPUT VALUES
	
	static final String url = "jdbc:mysql://localhost:3306/springboot";
	static final String user_name = "root";
	static final String password = "4876";
	
	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection(url,user_name,password);
				Statement st = con.createStatement()){
			
			Scanner SC = new Scanner(System.in);
			
			System.out.println("Enter ID to be Updated:");
			int id = SC.nextInt();
			
			System.out.println("Enter row name to be updated(as per database):");
			String row_name = SC.next();
			
			
			if(row_name.equals("edep") || row_name.equals("ename") || row_name.equals("esal")) {
				
				System.out.println("Enter updated value:");
				String U_value = SC.next();
				String query = "UPDATE EMPLOYEE SET "+row_name+" = '"+U_value+"' WHERE ENO = '"+id+"';";
				
				int rows_effected = st.executeUpdate(query);
				System.out.println(rows_effected+" rows updated successfully");
			}else {
				System.out.println("Enter valid row name");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
