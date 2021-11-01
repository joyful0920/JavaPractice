package ch6;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; ����. Ŭ���� ������ �ν��Ͻ� ���� ��� �Ұ���
	static int cv2 = new MemberCall().iv; // �ν��Ͻ��� �����ؾ� ��� ����

	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); ����. Ŭ���� �޼ҵ忡�� �ν��Ͻ� ���� ��� �Ұ���
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // ��ü ���� �� �ν��Ͻ� ���� ���� ����
	}
		
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // �ν��Ͻ� �޼ҵ忡�� �ν��Ͻ� ���� �ٷ� ��� ����
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // ����. Ŭ���� �޼ҵ忡�� �ν��Ͻ� �޼ҵ� ȣ�� �Ұ���
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ� ���� �� ȣ�� ����
		
		// ���ٷ� ǥ���� ����
		new MemberCall().instanceMethod1(); // ��� ���� ������ �������� �ʾ����Ƿ�, ������ �ν��Ͻ��� ��ȸ��
	}
	
	void instanceMethod2() { // �ν��Ͻ� �޼ҵ忡�� Ŭ���� �޼ҵ�� �ν��Ͻ� �޼ҵ� ��� �ٷ� ȣ�� ����
		staticMethod1();
		instanceMethod1();
	}

}