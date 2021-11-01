package ch7;

class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv()); // Tv��/�� �����ϼ̽��ϴ�.
		b.buy(new Computer()); // Computer��/�� �����ϼ̽��ϴ�.
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�."); // ���� ���� ���� 700�����Դϴ�.
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint + "���Դϴ�."); // ���� ���ʽ������� 30���Դϴ�.
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	// ���� Ŭ������ ������ Product(int price) ȣ��
	Tv() {
		super(100); // ������ 100����
	}
	
	// Object Ŭ������ toString()�� �������̵�
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Buyer {
	int money  = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}