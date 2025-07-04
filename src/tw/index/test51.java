package tw.index;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class test51 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try (FileInputStream fin = new FileInputStream("dir1/coffee.jpg");
				FileOutputStream fout = new FileOutputStream("dir2/coffee.jpg");) {
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
			}
			System.out.println("Finish");
			System.out.println(System.currentTimeMillis()-start);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
