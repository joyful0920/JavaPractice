package ch8;

public class ExceptionEx11 {

	public static void main(String[] args) throws Exception {
		method1(); // ���� Ŭ���� ���� static����̹Ƿ� ��ü �������� ���� ȣ�� ����
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}

	// ȣ�� ������ �� ���캸�� ������ �߻��� throw ������ method2 -> method1 -> main -> ���α׷� ����
//	Exception in thread "main" java.lang.Exception
//	at ch8.ExceptionEx11.method2(ExceptionEx11.java:14)
//	at ch8.ExceptionEx11.method1(ExceptionEx11.java:10)
//	at ch8.ExceptionEx11.main(ExceptionEx11.java:6)

}