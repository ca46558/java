package tw.index;

public class test28 {

	public static void main(String[] args) {
		

	}

}

class test281{
	protected Number m1() {
		System.out.println("test281:m1");
		return null;
	}
	
}
class test282 extends test281{
//	@Override //覆寫的意思 不是新方法可加可不加 加上去會幫忙報錯
	public Byte m1() {
		System.out.println("test282:m1");
		super.m1();
		return null;
	}
}