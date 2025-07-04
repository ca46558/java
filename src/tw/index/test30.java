package tw.index;

public class test30 {

	public static void main(String[] args) {
//		test301 obj1 = new test301();
		test301 obj1 = new test302();
		test301 obj2 = new test303();
		obj1.m3();
		obj2.m3();
		
		test301 obj3 = new test301() {
			void m3() {
				System.out.println("test301:m3()");
			}
		};
		obj3.m3();
	}

}

abstract class test301 {
	test301() {System.out.println("test301");}
	void m1() {}
	void m2() {}
	abstract void m3();
	}

class test302 extends test301 {
	void m3() {
		System.out.println("test302:m3()");
	}
}

class test303 extends test301 {
	void m3() {
		System.out.println("test303:m3()");
	}
}