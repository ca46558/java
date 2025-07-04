package tw.index;

import tw.object.Bike;

public class test23 {

	public static void main(String[] args) {
		String s1 = "test";
		String s2 = "test";
		String s3 = new String("test");
		String s4 = new String("test"); // new:新記憶體位置

		int a = 10, b = 10;
		
		System.out.println(a == b);
		System.out.println(s1 == s2); // == 比較物件內容
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3)); // .equals 比較字串內容 
	// hashcode() 比較是否不一樣 比較一樣的使用equals
	}

}
