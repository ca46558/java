package tw.index;

public class test24 {

	public static void main(String[] args) {
		String name = "test特斯特";
		System.out.println(name);
		String name2 = name.concat("chao");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.length());
		String name3 = name.replace('e', 'E');
		System.out.println(name3);
		System.out.println("------------");
		
		String s1 = new String("Test");
		String s2 = s1;
		System.out.println(s1 == s2);
		s2 = "Test";
		System.out.println(s1 == s2);
	}

}
