package ch7;

public class SuperTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10;
}

class Child extends Parent { // x, this.x, super.x ��� ���� ���� �ǹ�
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

//x=10
//this.x=10
//super.x=10