package ch7;

class Card {
	final int NUMBER; // ������� ����� �Բ� �ʱ�ȭ ���� �ʰ�
	final String KIND; // �����ڸ� ���� �ʱ�ȭ
	static int width = 100;
	static int height= 250;

	
	Card (String kind, int num) { // �Ű������� �Ѱܹ��� ������ ����� �ʱ�ȭ
		KIND = kind;
		NUMBER = num;
	}
	
	Card() {
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		// c.NUMBER = 5; ����! �ѹ� �ʱ�ȭ�� ����� �� ���� �Ұ���
		System.out.println(c.KIND); // HEART
		System.out.println(c.NUMBER); // 10
		System.out.println(c); // System.out.println(c.toString()); HEART 10
	}

}