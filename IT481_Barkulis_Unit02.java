package IT481_Barkulis_Unit02;

import java.util.*;
import java.sql.*;


public class IT481_Barkulis_Unit02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://DESKTOP-QNHUG2I\\SQLEXPRESS;databaseName=Students";
		String user = "user";
		String password = "";
				
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Connected to SQL Server");
		} catch (SQLException e) {
			System.out.println("OOOps, there's an error:");
			e.printStackTrace();
		}
		
		
	}

}
