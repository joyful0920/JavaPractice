package ch9;

public class MathEx2 {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		System.out.println("i = " + i); // i = -2147483648
		System.out.println("-i = " + (-i)); // -i = -2147483648. 정수형 최솟값에 비트전환연산자~을 적용하면 최대값이 되는데 여기에 1을 더해서 오버플로우 발생
		
		try {
			System.out.printf("Math.negateExact(%d) = %d%n", 10, Math.negateExact(10)); // Math.negateExact(10) = -10
			System.out.printf("Math.negateExact(%d) = %d%n", -10, Math.negateExact(-10)); // Math.negateExact(-10) = 10
			System.out.printf("Math.negateExact(%d) = %d%n", i, Math.negateExact(i)); // 예외 발생
		} catch (ArithmeticException e) {
			// i를 long 타입으로 형변환한 다음에 Math.negateExact(long a)를 호출
			System.out.printf("Math.negateExact(%d) = %d%n", (long)i, Math.negateExact((long)i)); // Math.negateExact(-2147483648) = 2147483648

		}
	}

}