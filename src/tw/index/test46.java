package tw.index;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test46 {

	public static void main(String[] args) {
		String mesg = "Hello Brad\nabcdefg\n1234567\n7654321";
		byte[] buf = mesg.getBytes();
		try {
		FileOutputStream fout = new FileOutputStream("dir1/file1.txt");	
		fout.write(buf);
		fout.flush(); //確保資料有輸出
		fout.close();
		System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e);
	    }	

	}

}
