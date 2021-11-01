package ch7;

public class SuperTest2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Child2 extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

//x=20
//this.x=20
//super.x=10