package ch6;

class Data { int x; }

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // main() : x = 10
		
		change(d.x); // change() : x = 1000
		System.out.println("After change(d.x)"); // After change(d.x)
		
		// d.x ���� ����� �� �ƴ϶� change �޼ҵ��� �Ű����� x�� ���� ����� ����.
		System.out.println("main() : x = " + d.x); // main() : x = 10
	}
	
	static void change(int x) { // �⺻�� �Ű�����
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}