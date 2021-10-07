package ch3;

public class OperatorEx10 {

	public static void main(String[] args) {
		
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;

		// 먼저 곱하는 경우 오버플로우된 값에다가 다시 연산이 이뤄지기 때문에 result1과 result2의 결과는 달라지게 됨.
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // 1000000 * 1000000 / 1000000 = -727
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); // 1000000 / 1000000 * 1000000 = 1000000


	}

}