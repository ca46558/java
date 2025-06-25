package tw.object;

public class Bike {
 protected double speed;
 //public 公開 任何人都可以看到
 //protected 相同package或子類別
 //private 在本類別才看的到
 
 public void upSpeed() {
	 speed = speed < 1 ? 1 : speed * 1.4;
	 
 }
 
 public void downSpeed() {
	 speed = speed < 1 ? 0 : speed * 0.6;
 }
 
 public double getSpeed() {
	 return speed;
 }
 
 
}
