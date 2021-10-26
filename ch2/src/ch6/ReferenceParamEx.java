package ch6;

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x); // main() : x = 10
		
		change(d); // change() : x = 1000
		System.out.println("After change(d)"); // After change(d)
		
		// ���� ����� �ּҷ� �޼ҵ忡 �Ѱ��ְ�, �� �ּҸ� �����Ͽ� x ���� �����߱� ������ d.x�� ���� ���������� ����� ����.
		System.out.println("main() : x = " + d.x); // main() : x = 1000
	}
	
	static void change(Data d) { // ������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}