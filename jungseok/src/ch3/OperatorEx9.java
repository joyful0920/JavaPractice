package ch3;

public class OperatorEx9 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		// int Ÿ�Գ��� ���� �� ����ȯ�� ���ϸ� long Ÿ�Կ� ��Ƶ� �����÷ο�� �� ���
		System.out.println("a = " + a); // a = -727379968
		
		// int �� long Ÿ���� ������ long Ÿ������ �ڵ� �����ȯ �Ǳ� ������ ���ϴ� �� ��� ����
		System.out.println("b = " + b); // b = 1000000000000
		
	}

}