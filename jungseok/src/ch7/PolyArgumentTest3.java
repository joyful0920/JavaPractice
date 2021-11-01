package ch7;

class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv()); // Tv��/�� �����ϼ̽��ϴ�.
		b.buy(new Computer()); // Computer��/�� �����ϼ̽��ϴ�.
		b.buy(new Audio()); // Audio��/�� �����ϼ̽��ϴ�.
		
		b.summary();
		// �����Ͻ� ��ǰ�� �ѱݾ��� 350�����Դϴ�.
		// �����Ͻ� ��ǰ�� Tv, Computer, Audio, �Դϴ�.
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {} // �⺻ ������
}

class Tv extends Product {
	// ���� Ŭ������ ������ Product(int price) ȣ��
	Tv() { super(100); }
	
	// Object Ŭ������ toString()�� �������̵�
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}

class Buyer {
	int money  = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i=0; // Product �迭�� ����� ī����
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // ��ǰ�� Prodcut[] item�� ����
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() { // ���� ��ǰ ��� ����
		int sum = 0; // ���� ��ǰ ���� �հ�
		String itemList =""; // ������ ��ǰ���
		
		// �ݺ����� ���� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for (int i=0; i < item.length; i++) {
			if (item[i] ==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}