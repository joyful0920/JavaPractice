package ch6;

class MyMath2 {
	long a, b;
	
	// �ν��Ͻ� ���� a, b���� �̿��ؼ� �۾��ϹǷ� �Ű� ������ �ʿ� ����.
	long add() { return a + b; }
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double devide() { return a / b; }
	
	// �ν��Ͻ� ������ ���� ���� �Ű� ���������� �۾� ����
	static long add(long a, long b) { return a + b; } // a, b�� ���� ����
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double devide(double a, double b) { return a / b; }
}

public class MyMathTest2 {
	
	public static void main(String[] args) {
		// Ŭ���� �޼ҵ� ȣ��. �ν��Ͻ� �������� ȣ�� ����
		System.out.println(MyMath2.add(200L, 100L)); // 300
		System.out.println(MyMath2.subtract(200L, 100L)); // 100
		System.out.println(MyMath2.multiply(200L, 100L)); // 20000
		System.out.println(MyMath2.devide(200.0, 100.0)); // 2.0
		
		MyMath2 mm = new MyMath2(); // �ν��Ͻ� ����
		mm.a = 200L;
		mm.b = 100L;
		
		// �ν��Ͻ� �޼ҵ�� ��ü ���� �� ȣ�� ����
		System.out.println(mm.add()); // 300
		System.out.println(mm.subtract()); // 100
		System.out.println(mm.multiply()); // 20000
		System.out.println(mm.devide()); // 2.0
	}

}