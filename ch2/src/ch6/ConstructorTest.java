package ch6;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2 (int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1(); // Data1에는 생성자가 없기 때문에 컴파일러가 기본 생성자를 정의하여 에러 발생 X
		
		// Data2에 Data2()라는 생성자가 정의되어 있지 않기 때문에 에러 발생
//		Data2 d2 = new Data2(); Data2(int x)가 이미 있기 때문에 컴파일러가 기본 생성자를 추가해주지 않음.
		
		Data2 d2 = new Data2(10); // OK
		
	}

}