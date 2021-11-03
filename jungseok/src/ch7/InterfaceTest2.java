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
//		// 인터페이스를 사용하긴 했지만
//		// 매개변수를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 동적으로 제공받아야 함.
//		a.autoPlay(new B()); // play in B class
//		a.autoPlay(new C()); // play in C class
//
//	}
//
//}