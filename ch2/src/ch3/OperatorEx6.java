package ch3;

public class OperatorEx6 {

	public static void main(String[] args) {
		
		byte a = 12;
		byte b = 22;
		// byte c = a + b; // ����. byte ������ ������ int ������ �ڵ� ��ȯ�� �� ����Ǳ� ������ ��� ���� int��
		byte c = (byte) (a + b); // int ������ �ڵ� ����ȯ�� ���� byte�� �����ϰ� ������ byte������ ����ȯ �ʿ�
		System.out.println(c);

	}

}