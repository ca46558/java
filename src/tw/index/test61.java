package tw.index;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class test61 {
 //用戶端
	public static void main(String[] args) {
		String mesg = "Hello, World";
		try {
		Socket socket = new Socket(InetAddress.getByName("10.0.101.133"), 9999);
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.append(mesg);
		pw.flush();
		pw.close();
		
		socket.close();
		System.out.println("OK");
			//對方願意跟你講話會看到OK
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
