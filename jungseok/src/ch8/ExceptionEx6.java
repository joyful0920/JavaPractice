package ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나눠 일부러 예외 발생
			System.out.println(4); // 실행되지 않음.
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) { // 위에서 예외가 처리되므로 실행되진 않음.
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}