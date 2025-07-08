package tw.index;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLData;
import java.util.Properties;

public class JDBC05 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("user", "root");
		prop.setProperty("password", "root");

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", prop);) {
			String sql = "SELECT * FROM cust";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);

			while(rs.next()) {
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				String tel = rs.getString("tel");
				String birthday = rs.getString("birthday");
				System.out.printf("%s:%s:%s:%s\n", id, cname, tel, birthday);
				
				
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
