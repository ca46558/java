package tw.object;

public class scooter extends Bike {
//extends => 延伸引用

	private int gear; // 0
	private String color;

	public scooter() {
		System.out.println("scooter()");
		color = "red";
	} //設定初始化  建構式
	
	public String getColor() {
		return color;
	}  // 新創的方法
	
	public void upSpeed() {
		if (gear > 0) {
			speed = speed < 1 ? 1 : speed * 1.8 * gear;
		}
	}  // 繼承的方法

	public int changeGear(int gear) {
		if (gear >= 0 && gear <= 4) {
			this.gear = gear;
		}
		return this.gear;
	}

}
