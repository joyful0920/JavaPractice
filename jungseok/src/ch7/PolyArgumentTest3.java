package ch7;

class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv()); // Tv을/를 구입하셨습니다.
		b.buy(new Computer()); // Computer을/를 구입하셨습니다.
		b.buy(new Audio()); // Audio을/를 구입하셨습니다.
		
		b.summary();
		// 구입하신 물품의 총금액은 350만원입니다.
		// 구입하신 제품은 Tv, Computer, Audio, 입니다.
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {} // 기본 생성자
}

class Tv extends Product {
	// 조상 클래스의 생성자 Product(int price) 호출
	Tv() { super(100); }
	
	// Object 클래스의 toString()을 오버라이딩
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
	
	Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
	int i=0; // Product 배열에 사용할 카운터
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 제품을 Prodcut[] item에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() { // 구매 물품 요약 정보
		int sum = 0; // 구매 물품 가격 합계
		String itemList =""; // 구입한 물품목록
		
		// 반복문을 통해 구입한 물품의 총 가격과 목록을 만든다.
		for (int i=0; i < item.length; i++) {
			if (item[i] ==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}