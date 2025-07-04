package tw.index;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class test57 {

	public static void main(String[] args) {
		test573 obj = new test573();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/test571.obj"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("---------");
		
		}
	

}

class test571 implements Serializable{
	test571() {
		System.out.println("test571");
	}
}

class test572 extends test571 {
	test572() {
		System.out.println("test572");
	}
}

class test573 extends test572 {
	test573() {
		System.out.println("test573");
	}
}