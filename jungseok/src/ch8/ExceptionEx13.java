package ch8;

public class ExceptionEx13 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main ���� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
			
	}
	
	static void method1() throws Exception {
		throw new Exception();
	}
	
//	main ���� ���ܰ� ó���Ǿ����ϴ�.
//	java.lang.Exception
//		at ch8.ExceptionEx13.method1(ExceptionEx13.java:16)
//		at ch8.ExceptionEx13.main(ExceptionEx13.java:7)

}