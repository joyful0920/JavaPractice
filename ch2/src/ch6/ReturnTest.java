package ch6;

public class ReturnTest {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3,5);
		System.out.println(result); // 8
		
		int[] result2 = {0, 0}; // �迭�� �����ϰ� result2[0]�� ���� 0���� �ʱ�ȭ
		r.add(3,5,result2); // �迭�� add �޼ҵ��� �Ű������� ����
		System.out.println(result2[0]); // 8
		System.out.println(result2[1]); // 2
		
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int a, int b, int[] result) {
		// �Ű������� �Ѱܹ��� �迭�� ������ ����
		result[0] = a + b;
		result[1] = b - a;
	}

}