package ch8;

public class ExceptionEx11 {

	public static void main(String[] args) throws Exception {
		method1(); // 같은 클래스 내의 static멤버이므로 객체 생성없이 직접 호출 가능
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}

	// 호출 스택을 잘 살펴보자 예외의 발생과 throw 순서는 method2 -> method1 -> main -> 프로그램 종료
//	Exception in thread "main" java.lang.Exception
//	at ch8.ExceptionEx11.method2(ExceptionEx11.java:14)
//	at ch8.ExceptionEx11.method1(ExceptionEx11.java:10)
//	at ch8.ExceptionEx11.main(ExceptionEx11.java:6)

}