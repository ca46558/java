package tw.index;

import tw.object.Bike;
import tw.object.scooter;

public class test18 {

	public static void main(String[] args) {
		scooter s1 = new scooter();
		s1.changeGear(4);
		s1.upSpeed();s1.upSpeed();
		s1.upSpeed();s1.upSpeed();s1.downSpeed();
		System.out.println(s1.getSpeed());
		
		Bike b1 = new Bike();
		b1.upSpeed();b1.upSpeed();
		b1.upSpeed();b1.upSpeed();b1.downSpeed();
		System.out.println(b1.getSpeed());

	}

}
