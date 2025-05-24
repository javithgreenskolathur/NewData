package org.add;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC2 {

	
	public static void main(String[] args) {
			
//		1.LOad the driver
//		Class:C		--> JDBC pacakgename.classname
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			2.Connection in DB
//			Drivermanager:C
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			
			String s = "select * from employees";
			
			PreparedStatement ps = con.prepareStatement(s);
			
			ResultSet result = ps.executeQuery();
			
			while (result.next()) {
				String name = result.getString("first_name");
				System.out.println(name);
				
				int int1 = result.getInt("salary");
				System.out.println(int1);
			}
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private void add() {
		System.out.println("wer");
	}



}