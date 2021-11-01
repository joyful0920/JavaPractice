package ch7;

class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance."); // This is a FireEngine instance.
		}
		
		// FireEngine Ŭ������ Ojbect�� Car�� �ڼ��̹Ƿ� �ش� �ν��Ͻ����� �����ϰ� �ִ� ��
		// �׷��� instanceof ���� ����� ��� true
		// true��� �� �ش� Ÿ������ ����ȯ�ص� �������ٴ� ��
		if (fe instanceof Car) {
			System.out.println("This is a Car instance."); // This is a Car instance.
		}
		
		if (fe instanceof Object) {
			System.out.println("This is an Object instance."); // This is an Object instance.
		
		// ���������� ����Ű�� �ִ� �ν��Ͻ��� ��Ŭ���� �̸��� ���ڿ��� ��ȯ
		System.out.println(fe.getClass().getName()); // Ŭ���� �̸� ��� FireEngine
	}

}

class Car { }
class FireEngine extends Car { }