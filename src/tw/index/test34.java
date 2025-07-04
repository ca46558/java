package tw.index;

import java.util.HashSet;

import tw.object.Bike;

public class test34 {
// set的特性 1.不重複 2.沒有順序
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("test");
		set.add(new Bike());
		set.add(123); // int => autp-boxing => Integer
		set.add(12.3); // double => Double
		System.out.println(set.size());
		set.add(123);
		set.add("test");
		set.add(true);
		System.out.println(set.size());
		System.out.println(set);
	}

}
