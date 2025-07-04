package tw.index;

public class test27 {

	public static void main(String[] args) {
		test271 obj1 = new test271();
		System.out.println(obj1.i);
		System.out.println(test271.j);
		
		test271 obj2 = new test271();
		System.out.println(obj2.i);
		System.out.println(test271.j);

		test271 obj3 = new test271();
		System.out.println(obj3.i);
		System.out.println(test271.j);
	}

}


class test271 {
	int i;
	static int j;
	test271(){
		i++;
		j++;
	}
}