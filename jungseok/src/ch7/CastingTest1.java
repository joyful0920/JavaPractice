package ch7;

class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); // water!!!
		car = fe; // car = (Car)fe; 자손 -> 조상
	//	car.water(); 에러! Car타입 참조변수로 water() 호출 불가
		fe2 = (FireEngine)car; // 조상 -> 자손
		fe2.water(); // water!!!
	}

}

class Car {
	String color;
	int door;
	void drive() {
			System.out.println("drive, Brrrr~");
	}
	void stop() {
			System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
			System.out.println("water!!!");
	}
}	

class Ambulance extends Car {
	void siren() {
			System.out.println("siren~~~");
	}
}