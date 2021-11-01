package ch7;

class BindingTest2 {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x); // p.x = 100
		p.method(); // Parent Method
		System.out.println("p.x = " + c.x); // c.x = 100
		c.method(); // Parent Method
	}

}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent { }