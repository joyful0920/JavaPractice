//package ch7;
//
//class A {
//	public void autoPlay(I i) {
//		i.play();
//	}
//}
//
//interface I {
//	public abstract void play();
//}
//
//class B implements I {
//	public void play() {
//		System.out.println("play in B class");
//	}
//}
//
//class C implements I {
//	public void play() {
//		System.out.println("play in C class");
//	}
//}
//
//class InterfaceTest2 {
//
//	public static void main(String[] args) {
//		A a = new A();
//		// �������̽��� ����ϱ� ������
//		// �Ű������� ���ؼ� �������̽� I�� ������ Ŭ������ �ν��Ͻ��� �������� �����޾ƾ� ��.
//		a.autoPlay(new B()); // play in B class
//		a.autoPlay(new C()); // play in C class
//
//	}
//
//}