package ch8;

public class ExceptionEx3 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5); // 실행되지 않음.
		}
		System.out.println(6);
	}

}