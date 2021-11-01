package ch7;

class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); // water!!!
		car = fe; // car = (Car)fe; �ڼ� -> ����
	//	car.water(); ����! CarŸ�� ���������� water() ȣ�� �Ұ�
		fe2 = (FireEngine)car; // ���� -> �ڼ�
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