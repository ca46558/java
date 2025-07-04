package tw.index;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.object.Student;

public class test56 {

	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("dir1/brad.score");
			ObjectInputStream oin = new ObjectInputStream(fin)){
			
			Object obj = oin.readObject();
			//if (obj instanceof Student) {System.out.println("student");}
			Student s1 = (Student)obj;
			System.out.println(s1.sum());
			System.out.println(s1.avg());
			System.out.println(s1.getBike().getSpeed());
			
			
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}