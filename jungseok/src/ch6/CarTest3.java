package ch6;

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(Car c) { // 인스턴스 복사를 위한 생성자
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
		
		this(c.color, c.gearType, c.door); // 더욱 간단한 방법
	}
	
	Car(String color, String gearType, int door) { 
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1); // c1의 복사본 c2 생성
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door); // c1의 color=white, gearType=auto, door=4
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door); // c2의 color=white, gearType=auto, door=4
		
		c1.door=100; // c1의 인스턴스변수 door의 값 변경
		
		System.out.println("c1.door=100; 수행 후");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door); // c1의 color=white, gearType=auto, door=100
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door); // c2의 color=white, gearType=auto, door=4
	}

}