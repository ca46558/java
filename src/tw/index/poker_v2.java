package tw.index;

public class poker_v2 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		boolean isRepeat;
		int rand;
		// 洗牌
		for (int i = 0; i < poker.length; i++) {
			do{
				rand = (int) (Math.random() * 52);
			

			// 檢查是否重複
			isRepeat = false;
			for (int j = 0; j < i; j++) {
				if (rand == poker[j]) {
					// 重複
					isRepeat = true;
					break;
				}
			}
			}
			while(isRepeat);
			
				poker[i] = rand;
				System.out.println(poker[i]);
			
	}
	}
}
