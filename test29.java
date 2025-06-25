package tw.index;

public class test29 {

	public static void main(String[] args) {
		test291 obj1 = new test291();
		test291 obj2 = new test292();
		test291 obj3 = new test293();
		
		obj1.m1();
		obj2.m1();
		obj3.m1();
		test292 obj4 = (test292)obj2; //強制m2方法型別變化
		obj4.m2();
		
		System.out.println(obj2 == obj4);
		System.out.println(obj2 instanceof test293);
		
	}
}

class test291{
	void m1() {System.out.println("test291:m1()");}
}

class test292 extends test291{
	void m1() {System.out.println("test292:m1{}");}
	void m2() {System.out.println("test292:m2{}");}
}

class test293 extends test291{
	void m1() {System.out.println("test293:m1()");}
}
