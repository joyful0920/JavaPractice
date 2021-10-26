package ch6;

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // main() : x = 10
		
		change(d); // change() : x = 1000
		System.out.println("After change(d)"); // After change(d)
		
		// 값이 저장된 주소룰 메소드에 넘겨주고, 그 주소를 참조하여 x 값을 변경했기 때문에 d.x의 값은 영구적으로 변경된 것임.
		System.out.println("main() : x = " + d.x); // main() : x = 1000
	}
	
	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}