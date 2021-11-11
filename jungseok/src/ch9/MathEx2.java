package ch9;

public class MathEx2 {

	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		
		System.out.println("i = " + i); // i = -2147483648
		System.out.println("-i = " + (-i)); // -i = -2147483648. ������ �ּڰ��� ��Ʈ��ȯ������~�� �����ϸ� �ִ밪�� �Ǵµ� ���⿡ 1�� ���ؼ� �����÷ο� �߻�
		
		try {
			System.out.printf("Math.negateExact(%d) = %d%n", 10, Math.negateExact(10)); // Math.negateExact(10) = -10
			System.out.printf("Math.negateExact(%d) = %d%n", -10, Math.negateExact(-10)); // Math.negateExact(-10) = 10
			System.out.printf("Math.negateExact(%d) = %d%n", i, Math.negateExact(i)); // ���� �߻�
		} catch (ArithmeticException e) {
			// i�� long Ÿ������ ����ȯ�� ������ Math.negateExact(long a)�� ȣ��
			System.out.printf("Math.negateExact(%d) = %d%n", (long)i, Math.negateExact((long)i)); // Math.negateExact(-2147483648) = 2147483648

		}
	}

}