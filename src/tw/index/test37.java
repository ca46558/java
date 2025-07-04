package tw.index;

import java.util.ArrayList;
import java.util.LinkedList;

import tw.object.Member;

public class test37 {
	public static void main(String[] args) {
		
		// List 特性
		// 1.可重複
		// 2.有順序性 來自index
		
		ArrayList<String> list = new ArrayList<>();
		list.add(0, "test01");
		list.add(0, "test02");
		list.add(0, "test03");
		list.add(0, "test04");
		list.add(0, "test05");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("------------");
		
		Member m1 = new Member(1, "Allen");
		Member m2 = new Member(2, "Eric");
		Member m3 = new Member(2, "Tony");
		Member m4 = new Member(1, "Andy");
		LinkedList<Member> ms = new LinkedList<>();
		ms.add(m1);
		ms.add(m2);
		ms.add(m3);
		ms.add(m4);
		System.out.println(ms.size());
		System.out.println(ms);
		
	}
}
