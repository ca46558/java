package tw.index;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test47 {

	public static void main(String[] args) {
		File f1 = new File("dir1/file1.txt");
		long len = f1.length();
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			for (int i = 0; i < len; i++) {
				System.out.println((char) fin.read());
			}
			System.out.print((char) fin.read());
			System.out.print((char) fin.read());
			System.out.print((char) fin.read());
			System.out.print((char) fin.read());
			fin.close();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
