package ch8;

public class ExceptionEx12 {

	public static void main(String[] args) {
		method1(); // ���� Ŭ������ static ����̹Ƿ� ��ü ���� ���� ���� ȣ�� ����
	}
	
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1���� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
	
//	method1���� ���ܰ� ó���Ǿ����ϴ�.
//	java.lang.Exception
//		at ch8.ExceptionEx12.method1(ExceptionEx12.java:11)
//		at ch8.ExceptionEx12.main(ExceptionEx12.java:6)

}