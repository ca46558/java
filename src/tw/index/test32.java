package tw.index;

public class test32 {
// 訂單
	public static void main(String[] args) {
		Order order1 = new Order1("D001", 100);
		Order order2 = new Order2("D002", 123);
		
		
		
		order1.paid();
		order1.notifyCust();
		order1.process();
		System.out.println("--------");
		order2.paid();
		order2.notifyCust();
		order2.process();
	}

}

interface Shipable {
	void ship();
}

abstract class Order {
	private String orderID;
	private int amount;

	Order(String orderID, int amount) {
		this.orderID = orderID;
		this.amount = amount;
	}

	void paid() {
		System.out.println("付錢了");
	}

	void notifyCust() {
		System.out.println("通知客戶");
	}

	abstract void process();
}

class Order1 extends Order {
	Order1(String orderID, int amount) {
		super(orderID, amount);
	}

	void process() {
		System.out.println("數位商品出貨了");
	}
}

class Order2 extends Order implements Shipable {
	Order2(String orderID, int amount) {
		super(orderID, amount);
	}

	void process() {
		System.out.println("實體商品準備出貨了");
		ship();
	}

	@Override
	public void ship() {
		System.out.println("實體商品出貨了");

	}
}