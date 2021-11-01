package ch7;

import java.util.Vector;

class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv= new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv); // Tv��/�� �����ϼ̽��ϴ�.
		b.buy(com); // Computer��/�� �����ϼ̽��ϴ�.
		b.buy(audio); // Audio��/�� �����ϼ̽��ϴ�.
		b.summary();
		// �����Ͻ� ��ǰ�� �ѱݾ��� 350�����Դϴ�.
		// �����Ͻ� ��ǰ�� Tv, Computer, Audio, �Դϴ�.
		System.out.println();
		b.refund(com); // Computer��/�� ��ǰ�ϼ̽��ϴ�.
		b.summary();
		// �����Ͻ� ��ǰ�� �ѱݾ��� 150�����Դϴ�.
		// �����Ͻ� ��ǰ�� Tv, Audio�Դϴ�.
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	
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
	
	Vector item = new Vector(); // ������ ��ǰ�� �����ϴ� �� Vector ���
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p) // ��ǰ�� Vector�� ����
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product p) { // ȯ��
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		} else { // ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() { // ���� ��ǰ ��� ����
		int sum = 0; // ���� ��ǰ ���� �հ�
		String itemList =""; // ������ ��ǰ���
		
		if (item.isEmpty()) { // Vector�� ������� Ȯ��
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		// �ݺ����� ���� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for (int i=0; i < item.size(); i++) {
			Product p = (Product)item.get(i); // Vector�� i���� �ִ� ��ü�� �ҷ���.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}