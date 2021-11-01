package ch7;

class Card {
	final int NUMBER; // 상수지만 선언과 함꼐 초기화 하지 않고
	final String KIND; // 생성자를 통해 초기화
	static int width = 100;
	static int height= 250;

	
	Card (String kind, int num) { // 매개변수로 넘겨받은 값으로 상수를 초기화
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
		// c.NUMBER = 5; 에러! 한번 초기화된 상수는 값 변경 불가능
		System.out.println(c.KIND); // HEART
		System.out.println(c.NUMBER); // 10
		System.out.println(c); // System.out.println(c.toString()); HEART 10
	}

}