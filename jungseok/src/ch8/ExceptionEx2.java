package ch8;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for (int i=0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) { // 정수를 0으로 나눌 경우 발생하는 예외 처리 
				System.out.println("0"); // 예외가 발생하면 0을 출력
			}
		}
	}

}