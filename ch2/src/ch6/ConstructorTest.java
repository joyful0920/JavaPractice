package ch6;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2 (int x) { // �Ű������� �ִ� ������
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1(); // Data1���� �����ڰ� ���� ������ �����Ϸ��� �⺻ �����ڸ� �����Ͽ� ���� �߻� X
		
		// Data2�� Data2()��� �����ڰ� ���ǵǾ� ���� �ʱ� ������ ���� �߻�
//		Data2 d2 = new Data2(); Data2(int x)�� �̹� �ֱ� ������ �����Ϸ��� �⺻ �����ڸ� �߰������� ����.
		
		Data2 d2 = new Data2(10); // OK
		
	}

}