package tw.index;

public class test21 {

	public static void main(String[] args) {
//		test211 obj1 = new test211(0);
//		test212 obj2 = new test212();
		test213 obj3 = new test213();
		test213 obj31 = new test213(1);
		test213 obj32 = new test213(1.0);
	}

}

// JAVA裡面所有類別一定有建構式
// 若無定義 使用父類別無傳參數

class test211 extends Object {
	test211(int a) {
		// super();
		System.out.println("test211(int)");
	}
}

// 建構式 => 將祖宗八代完成初始化 

class test212 extends test211 {
	test212() {
		// super();
		super(1);
		System.out.println("test212()");
	}

}

class test213 extends test212 {
	test213() {
		System.out.println("test213()");
	}

	test213(int a) {
		// super();
		this();
		System.out.println("test213(int)");
	}
	test213(double a){
		this(2);
		System.out.println("test213(double)");
	}
}
