package ch6;

public class CarTest2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door); // c1�� color=white, gearType=auto, door=4
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door); // c2�� color=blue, gearType=auto, door=4
	}

}