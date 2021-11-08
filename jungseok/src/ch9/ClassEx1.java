package ch9;

final class Card {
	String kind;
	int num;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ":" + num;
	}
}	

class ClassEx1 {

	public static void main(String[] args) throws Exception {
		Card c = new Card("HEART", 3);
		Card c2 = Card.class.newInstance();
		
		Class cObj = c.getClass();
		
		System.out.println(c); // HEART:3
		System.out.println(c2); // SPADE:1
		System.out.println(cObj.getName()); // ch9.Card
		System.out.println(cObj.toGenericString()); // final class ch9.Card
		System.out.println(cObj.toString()); // class ch9.Card
	}

}