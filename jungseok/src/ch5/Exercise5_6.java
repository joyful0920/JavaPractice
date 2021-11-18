package ch5;

// 거스름돈 동전 계산
public class Exercise5_6 {

	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야 함.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money=" + money);
		
		for (int i=0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + money/coinUnit[i]);
			money = money % coinUnit[i];
		}
		
//		money=2680
//		500원: 5
//		100원: 1
//		50원: 1
//		10원: 3

	}

}