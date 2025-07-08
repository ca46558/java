package tw.index;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC02 {

	public static void main(String[] args) {
//		try {
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=root&password=root");
//		System.out.println("OK");
//		conn.close();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		
		
//		try {
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
//		System.out.println("OK2");
//		conn.close();
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}

	Properties prop = new Properties();
	prop.setProperty("user", "root");
	prop.setProperty("password", "root");
	
	try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
	System.out.println("OK3");
	conn.close();
	} catch (SQLException e) {

		e.printStackTrace();
	}
	
	}

}
