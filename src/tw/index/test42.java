package tw.index;

public class test42 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c;
		int[] d = { 1, 2, 3, 4 };

		System.out.println("Hello, world");
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[200]);
		} catch (ArithmeticException e) {
			System.out.println("Ooooop!(1)");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ooooop!(2)");
		
		}catch(RuntimeException e) {
			System.out.println("xxx");
		}
		System.out.println("Finish");

	}

}
