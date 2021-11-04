package ch8;

public class ExceptionEx12 {

	public static void main(String[] args) {
		method1(); // 같은 클래스의 static 멤버이므로 객체 생성 없이 직접 호출 가능
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
	
//	method1에서 예외가 처리되었습니다.
//	java.lang.Exception
//		at ch8.ExceptionEx12.method1(ExceptionEx12.java:11)
//		at ch8.ExceptionEx12.main(ExceptionEx12.java:6)

}