package ch7;

class Outer {
	int value = 10; // Outer.this.value
	
	class Inner {
		int value = 20; // this.value
		
		void method1() {
			int value = 30;
			System.out.println(" value :" + value); // value :30
			System.out.println(" this.value :" + this.value); // this.value :20
			System.out.println("Outer.this.value :" + Outer.this.value); // Outer.this.value :
		}
	}
}

class InnerEx5 { 

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
	}

}