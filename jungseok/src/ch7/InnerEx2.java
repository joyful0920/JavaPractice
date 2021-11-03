package ch7;

class InnerEx2 {
	
	class InstanceInner {}
	static class StaticInner {}
	
	// �ν��Ͻ� ��� ���� ���� ���� ���� ����
	InstanceInner iv = new InstanceInner();
	// static ��� ���� ���� ���� ���� ����
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static ����� �ν��Ͻ� ����� ���� ���� �Ұ�
	// 	InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// ���� �����Ϸ��� �Ʒ��� ���� ��ü ����
		// �ν��Ͻ� Ŭ������ �ܺ� Ŭ������ ���� �����ؾ� ���� ����
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		// �ν��Ͻ� �޼ҵ忡���� �ν��Ͻ� ����� static ��� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// �޼ҵ� ���� ���������� ���𵵴� ���� Ŭ������ �ܺο��� ���� �Ұ�
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner { }
		LocalInner lv = new LocalInner();
	}

}