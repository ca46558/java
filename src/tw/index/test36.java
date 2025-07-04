package tw.index;

import java.util.HashSet;

import tw.object.Member;

public class test36 {

	public static void main(String[] args) {
		
		Member m1 = new Member(1, "Allen");
		Member m2 = new Member(2, "Eric");
		Member m3 = new Member(2, "Tony");
		Member m4 = new Member(1, "Andy");
		
		HashSet<Member> members = new HashSet<>();
        members.add(m1);
        members.add(m2);
        members.add(m3);
        members.add(m4);
        
        System.out.println(members.size());
        System.out.println(members);
        
        
	}

}


