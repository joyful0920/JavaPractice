package ch7;

class InnerEx1 {
	
	class InstanceInner {
		int iv = 100;
	//	static int cv = 100; ����! static ���� ���� �Ұ�
		final static int CONST = 100; // final static�� ����̹Ƿ� ���
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static Ŭ������ static ��� ���� ����
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
		//	static int cv = 100; ����! static ���� ���� �Ұ�
			final static int CONST = 100; // final static�� ����̹Ƿ� ���
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST); // 100
		System.out.println(StaticInner.cv); // 200
	}

}