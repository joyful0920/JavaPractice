package ch5;

// �Ž����� ���� ���
public class Exercise5_6 {

	public static void main(String[] args) {
		// ū �ݾ��� ������ �켱������ �Ž��� ��� ��.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money=" + money);
		
		for (int i=0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "��: " + money/coinUnit[i]);
			money = money % coinUnit[i];
		}
		
//		money=2680
//		500��: 5
//		100��: 1
//		50��: 1
//		10��: 3

	}

}