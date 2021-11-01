package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(5); // ���� Ŭ���� �� �޼ҵ��̱� ������ ȣ�� �� Ŭ���� �̸� ���� ����
		
		System.out.println(result); // 120
	}
	
	static int factorial(int n) { // static �̹Ƿ� �ν��Ͻ��� �������� �ʰ� �ٷ� ȣ�� ����
		int result = 0;
		
		if (n == 1 )
			result = 1;
		else 
			result = n * factorial(n-1); // ��� ȣ��
		
		return result;
	}
	

	// ����ȭ �޼ҵ� ����
//	static int factorial (int n) {
//		if (n == 1) return 1;
//		
//		return n * factorial(n-1);
//	}

}