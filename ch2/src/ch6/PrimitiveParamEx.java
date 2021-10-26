package ch6;

class Data { int x; }

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // main() : x = 10
		
		change(d.x); // change() : x = 1000
		System.out.println("After change(d.x)"); // After change(d.x)
		
		// d.x 값이 변경된 게 아니라 change 메소드의 매개변수 x의 값이 변경된 것임.
		System.out.println("main() : x = " + d.x); // main() : x = 10
	}
	
	static void change(int x) { // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}