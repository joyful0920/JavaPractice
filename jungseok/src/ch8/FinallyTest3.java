package ch8;

public class FinallyTest3 {

	public static void main(String[] args) {
		// method1()�� static �޼ҵ��̹Ƿ� �ν��Ͻ� �������� ���� ȣ�� ����
		FinallyTest3.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼ҵ�� ���ƿԽ��ϴ�.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return; // ���� ���� ���� �޼ҵ� ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1(U)�� finally �ҷ��� ����Ǿ����ϴ�.");
		}
	}
}