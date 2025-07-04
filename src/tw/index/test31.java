package tw.index;

public class test31 {
// interface(規格) => 永遠是public公開的
	public static void main(String[] args) {
		test311 obj1 = new test312();  //多型
		test311 obj2 = new test313();
		test314 obj3 = new test312();
		obj1.m1();
		obj3.m3();

	}

}
interface test311{
	void m1();
	void m2();
}
// implements(能夠做到)
class test312 extends Object implements test311, test314{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
}
class test313 implements test311{
	public void m1() {}
	public void m2() {}
}
interface test314{
	void m3();
	void m4();
}
interface test315 extends test311, test314{
	void m5();
	void m6();
}
class test316 implements test315{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}

}