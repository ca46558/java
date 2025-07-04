package tw.index;

import java.security.GeneralSecurityException;

public class test43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(3);
		} catch (GeneralSecurityException e) {
			
			e.printStackTrace();
		}
		System.out.println("OK");

	}

}

class Bird{
	int leg;
	void setLeg(int n) throws GeneralSecurityException{  //對外宣稱
		if (n>=0 && n<=2) {
			leg = n;
		}else {
			throw new GeneralSecurityException();
		}
		
	}
}