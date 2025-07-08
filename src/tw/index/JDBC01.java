package tw.index;

public class JDBC01 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//class.forName("com.microsoft.
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
