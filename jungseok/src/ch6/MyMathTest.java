package ch6;

public class MyMathTest {

	public static void main(String[] args) {
		// �ν��Ͻ� ����
		MyMath mm = new MyMath();
		
		// �޼ҵ� ȣ��
		// ��ȯ�� ��� ������ ����
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // double ��� long ������ ȣ���Ͽ����Ƿ�, double�� �ڵ� ����ȯ��.
		
		System.out.println("add(5L, 3L) = " + result1); // add(5L, 3L) = 8
		System.out.println("subtact(5L, 3L) = " + result2); // subtact(5L, 3L) = 2
		System.out.println("multiply(5L, 3L) = " + result3); // multiply(5L, 3L) = 8
		System.out.println("divide(5L, 3L) = " + result4); // divide(5L, 3L) = 1.6666666666666667
		 
	}

}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
//		return a + b; �� �� ���� ������ ǥ�� ����
	}	
		long subtract(long a, long b) { return a - b; }
		long multiply(long a, long b) { return a + b; }
		double divide(double a, double b) { return a / b; }
}