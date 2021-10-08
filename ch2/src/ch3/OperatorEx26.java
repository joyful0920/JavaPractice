package ch3;

public class OperatorEx26 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b); // a=5, b=0
		
		// 좌측 피연산자의 값이 true면 우측 피연산자의 값을 평가하지 않으므로 증감 연산자도 연산되지 않음.
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0); // a!=0 || ++b!=0 = true
		System.out.printf("a=%d, b=%d%n", a, b); // a=5, b=0
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0); // a==0 && ++b!=0 = false
		System.out.printf("a=%d, b=%d%n", a, b); // a=5, b=0
		
	}

}