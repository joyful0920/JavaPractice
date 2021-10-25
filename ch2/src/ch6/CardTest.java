package ch6;

public class CardTest {

	public static void main(String[] args) {
		
		// Ŭ���� ����(static ����)�� ��ü �������� 'Ŭ�����̸�.Ŭ��������'�� ���� ��� ����
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		// �ν��Ͻ� ������ ���� ����
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
		// Ŭ���� ������ ���� ����
		c1.width = 50;
		c2.height = 80;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
//		Card.width = 100
//		Card.height = 250
//		c1�� Heart, 7�̸�, ũ��� (100, 250)
//		c2�� Spade, 4�̸�, ũ��� (100, 250)
//		c1�� Heart, 7�̸�, ũ��� (50, 80)
//		c2�� Spade, 4�̸�, ũ��� (50, 80)
				
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}