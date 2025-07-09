package tw.index;

import tw.object.BCrypt;

public class JDBC09 {

	public static void main(String[] args) {
		String passwd = "123456";
		String hashPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hashPasswd);
		if(BCrypt.checkpw(passwd, hashPasswd)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
