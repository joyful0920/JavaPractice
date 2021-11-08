package ch9;

// clone() ����� ���� ������ Ŭ������ Cloneable �������̽� ������ �ݵ�� �ʿ�
// �ν��Ͻ� �����͸� ��ȣ�ϱ� ���� ��ġ
//class Point implements Cloneable {
//	int x, y;
//	
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public String toString() {
//		return "x=" + x + ", y=" + y;
//	}
//	
//	// clone �������̵��� ���ؼ� ���� �����ڸ� public���� ���� �ʿ�
//	// �׷��� ��Ӱ��谡 ���� �ٸ� Ŭ�������� clone() ȣ�� ����
//	public Object clone() {
//		Object obj = null;
//		
//		// ���� Ŭ������ clone()�� ȣ���ϴ� try-catch��
//		try {
//			obj = super.clone(); // clone()�� �ݵ�� ����ó�� �ʿ�
//		} catch (CloneNotSupportedException e) {}
//		
//		return obj;
//	}
//}

public class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone(); // �����ؼ� ���ο� ��ü ����
		System.out.println(original);
		System.out.println(copy);
	}

}