package ch8;

public class ExceptionEx16 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main �޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�.");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 �޼ҵ忡�� ���ܰ� ó���Ǿ����ϴ�.");
			throw e; // �ٽ� ���� �߻�
		}
	}

}