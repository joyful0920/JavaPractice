package ch8;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나눠 일부러 예외 발생
			System.out.println(4); // 실행되지 않음.
		} catch (ArithmeticException ae) {
			System.out.println(5); // 예외가 발생하여 실행됨.
		}
		System.out.println(6);
	}

}