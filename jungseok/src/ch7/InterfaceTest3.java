package ch7;

class A {
	void methodA() {
		// ��3�� Ŭ������ �޼ҵ带 ����
		// �������̽� I�� ������ Ŭ������ �ν��Ͻ��� ����.
		// �ٸ� Ŭ������ �ν��Ͻ��� ����Ǿ
		// A Ŭ������ ���� ���� InstanceManager�� getInstance()�� �����ϸ� �ȴٴ� ����
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString()); // �������̽� I Ÿ���� �������� i�ε� Object Ŭ������ �޼ҵ� ȣ�� ����
	}
}

interface I {
	public abstract void methodB();
}

class B implements I {
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() { return "class B"; }
}

class InstanceManager {
	public static I getInstance() {
		return new B();
	}
}

class InterfaceTest3 {

	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}

}