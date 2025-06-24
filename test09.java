package tw.index;

public class test09 {

	public static void main(String[] args) {
		int i = 0;
		for (printindex(); i < 10; printLine()) {
			System.out.println(i++);
		}
		System.out.println("-------");
		System.out.println(i);
	}

	static void printindex() {
		System.out.println("index");
	}

	static void printLine() {
		System.out.println("------");
	}

}
