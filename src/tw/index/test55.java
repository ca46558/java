package tw.index;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.object.Student;

public class test55 {

	public static void main(String[] args) {
		Student s1 = new Student("Brad", 76, 87, 32);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		try {
			FileOutputStream fout = new FileOutputStream("dir1/brad.score");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(s1);
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
