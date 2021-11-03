package ch7;

class A {
	void methodA() {
		// 제3의 클래스의 메소드를 통해
		// 인터페이스 I를 구현한 클래스의 인스턴스를 얻어옴.
		// 다른 클래스의 인스턴스로 변경되어도
		// A 클래스의 변경 없이 InstanceManager의 getInstance()만 변경하면 된다는 장점
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString()); // 인터페이스 I 타입의 참조변수 i로도 Object 클래스의 메소드 호출 가능
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