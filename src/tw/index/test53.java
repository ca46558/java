package tw.index;


import java.io.FileReader;

public class test53 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/file1.txt");
			int c;
			while ((c = reader.read()) != -1) {
				System.out.println((char) c);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
