package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0���� ���� �Ϻη� ���� �߻�
			System.out.println(4); // ������� ����.
		} catch (ArithmeticException ae) {
			ae.printStackTrace(); // �������� ae�� ���� ������ ���� �ν��Ͻ��� ���� ����
			System.out.println("���� �޼��� : " + ae.getMessage());
//			java.lang.ArithmeticException: / by zero
//			at ch8.ExceptionEx7.main(ExceptionEx7.java:10)
		}
		System.out.println(6);
	}

}