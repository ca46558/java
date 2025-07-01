package tw.index;

public class test26 {

	public static void main(String[] args) {
	test261.m2();
	test261.m2();
	test261.m2();
	
	test261 obj1 = new test261();
	test261 obj2 = new test261();

	}

}

class test261 {
	{
		System.out.println("test261{}");
		m1();
		m2();
	}
	static {
		System.out.println("test261:static{}");
		m2();
	}
	test261(){
		System.out.println("test261{}");
		m1();
	}
	void m1() {
		System.out.println("test261:m1()");
	}
	static void m2() {
		System.out.println("test261:static:m2");
	}
	
}