package ch3;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 2;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b); // 11 + 2 = 13
		System.out.printf("%d - %d = %d%n", a, b, a - b); // 11 - 2 = 9
		System.out.printf("%d * %d = %d%n", a, b, a * b); // 11 * 2 = 22
		System.out.printf("%d / %d = %d%n", a, b, a / b); // 11 / 2 = 5
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); // 11 / 2.000000 = 5.500000
		
	}

}