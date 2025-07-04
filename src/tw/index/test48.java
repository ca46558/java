package tw.index;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test48 {

	public static void main(String[] args) {
		File f1 = new File("dir1/file1.txt");
		
		try {
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			int c;
			while ( (c = fin.read())!= -1) {
				System.out.println((char)c);
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