package ch3;

public class OperatorEx13 {

public static void main(String[] args) {

	char c1 = 'a';
	
//	char c2 = c1 + 1; // ������ ���� �߻�
	char c2 = (char)(c1 + 1); // ����ȯ �ʿ�
	char c3 = 'a' + 1; // c3�� 'b'�� �����.
	
	System.out.println(c2); // b
	System.out.println(c3); // b

}

}