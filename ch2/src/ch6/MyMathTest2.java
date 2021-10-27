package ch6;

class MyMath2 {
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개 변수가 필요 없음.
	long add() { return a + b; }
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double devide() { return a / b; }
	
	// 인스턴스 변수와 관계 없이 매개 변수만으로 작업 가능
	static long add(long a, long b) { return a + b; } // a, b는 지역 변수
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double devide(double a, double b) { return a / b; }
}

public class MyMathTest2 {
	
	public static void main(String[] args) {
		// 클래스 메소드 호출. 인스턴스 생성없이 호출 가능
		System.out.println(MyMath2.add(200L, 100L)); // 300
		System.out.println(MyMath2.subtract(200L, 100L)); // 100
		System.out.println(MyMath2.multiply(200L, 100L)); // 20000
		System.out.println(MyMath2.devide(200.0, 100.0)); // 2.0
		
		MyMath2 mm = new MyMath2(); // 인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		
		// 인스턴스 메소드는 객체 생성 후 호출 가능
		System.out.println(mm.add()); // 300
		System.out.println(mm.subtract()); // 100
		System.out.println(mm.multiply()); // 20000
		System.out.println(mm.devide()); // 2.0
	}

}