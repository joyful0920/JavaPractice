package ch3;

public class OperatorEx10 {

	public static void main(String[] args) {
		
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;

		// ���� ���ϴ� ��� �����÷ο�� �����ٰ� �ٽ� ������ �̷����� ������ result1�� result2�� ����� �޶����� ��.
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // 1000000 * 1000000 / 1000000 = -727
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); // 1000000 / 1000000 * 1000000 = 1000000


	}

}