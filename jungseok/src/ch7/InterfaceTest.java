package ch7;

//class A {
//	public void methodA(B b) {
//		// B 인스턴스를 생성하고 메소드 호출
//		// A와 B가 직접적으로 연결되어 있기 때문에
//		// B의 내용이 변경되면 A도 영향받는다는 단점
//		b.methodB();
//	}
//}
//
//class B {
//	public void methodB() {
//		System.out.println("methodB()");
//	}
//}
//
//class InterfaceTest {
//
//	public static void main(String[] args) {
//		A a = new A();
//		a.methodA(new B()); // methodB in B class
//
//	}
//
//}