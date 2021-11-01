package ch7;

import java.util.Vector;

class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv= new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv); // Tv을/를 구입하셨습니다.
		b.buy(com); // Computer을/를 구입하셨습니다.
		b.buy(audio); // Audio을/를 구입하셨습니다.
		b.summary();
		// 구입하신 물품의 총금액은 350만원입니다.
		// 구입하신 제품은 Tv, Computer, Audio, 입니다.
		System.out.println();
		b.refund(com); // Computer을/를 반품하셨습니다.
		b.summary();
		// 구입하신 물품의 총금액은 150만원입니다.
		// 구입하신 제품은 Tv, Audio입니다.
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
	
	Vector item = new Vector(); // 구입한 제품을 저장하는 데 Vector 사용
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p) // 제품을 Vector에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product p) { // 환불
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else { // 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() { // 구매 물품 요약 정보
		int sum = 0; // 구매 물품 가격 합계
		String itemList =""; // 구입한 물품목록
		
		if (item.isEmpty()) { // Vector가 비었는지 확인
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		// 반복문을 통해 구입한 물품의 총 가격과 목록을 만든다.
		for (int i=0; i < item.size(); i++) {
			Product p = (Product)item.get(i); // Vector의 i번재 있는 객체를 불러옴.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}