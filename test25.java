package tw.index;

import tw.object.TWid;

public class test25 {

	public static void main(String[] args) {

		System.out.println(TWid.isRightID("M122733385"));
		System.out.println("----");
		
		TWid id1 = new TWid();
		TWid id2 = new TWid(false);
		TWid id3 = new TWid('B');
		TWid id4 = new TWid(true, 'A');
		System.out.println(id1.getid());
		System.out.println(id2.getid());
		System.out.println(id3.getid());
		System.out.println(id4.getid());
		
		TWid id5 = TWid.craeteTWid("A123456789");
		if(id5 != null) {
			System.out.println(id5.getid());
		}else {
			System.out.println("xxxx");
		}
		
	}

}
