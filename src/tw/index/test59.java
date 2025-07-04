package tw.index;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.DatabaseMetaData;

public class test59 {

	public static void main(String[] args) {
		String mesg = "操機掰";
		byte[] data = mesg.getBytes();
		
		try {
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket pocket = new DatagramPacket(data, data.length,
				InetAddress.getByName("10.0.101."), 8888);
		socket.send(pocket);
		socket.close();
		System.out.println("send OK");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
