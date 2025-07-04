package tw.index;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class test60 {

	public static void main(String[] args) {
		byte[] buf = new byte[4*1024];
		while (true) {
		try {
		DatagramSocket socket = new DatagramSocket(8888);
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		System.out.println("wait...");
		socket.receive(packet);
		socket.close();
		System.out.println("Receive OK");
		
		String urip = packet.getAddress().getHostAddress();
		int len = packet.getLength();
		byte[] data = packet.getData();
		String mesg = new String(data, 0, len);
		System.out.printf("%s : %s\n", urip, new String(data,0,len));
		if (mesg.equals("quit")) {
			break;
		}
		
		
		
		}catch (Exception e) {
			e.printStackTrace();
			break;
		}
	}
	}
}
