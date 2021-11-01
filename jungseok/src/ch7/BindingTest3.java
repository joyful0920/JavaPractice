package ch7;

class BindingTest3 {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x); // p.x = 100
		p.method();
//		x=200
//		suepr.x=100
//		this.x=200
		System.out.println();
		System.out.println("p.x = " + c.x); // c.x = 200 
		c.method();
//		x=200
//		suepr.x=100
//		this.x=200		
	}

}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x); // this.x¿Í µ¿ÀÏ
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}