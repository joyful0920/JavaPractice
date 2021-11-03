package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나눠 일부러 예외 발생
			System.out.println(4); // 실행되지 않음.
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // 참조변수 ae를 통해 생성된 예외 인스턴스에 접근 가능
			System.out.println("예외 메세지 : " + ae.getMessage());
//			java.lang.ArithmeticException: / by zero
//			at ch8.ExceptionEx7.main(ExceptionEx7.java:10)
		}
		System.out.println(6);
	}

}