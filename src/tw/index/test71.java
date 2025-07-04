package tw.index;

public class test71 {

	public static void main(String[] args) {
		test711 obj1 = new test711();
		test712 obj2 = new test712();
		obj1.start();
//		obj2.run();物件導向 非執行序
		Thread t1 = new Thread(obj2);
		t1.start();
	}

}

class test711 extends Thread {
	@Override
	public void run() {
		System.out.println("test711: run thread");
	}
}

class test712 implements Runnable {
	@Override
	public void run() {
		System.out.println("test712: run");
	}
}