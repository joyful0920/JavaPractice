package ch9;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2)); // true
		
		// String Ŭ������ ���ڿ� ������ ������,
		// ������ �ؽ��ڵ带 ��ȯ�ϵ��� hashCode �޼ҵ尡 �������̵� ������.
		System.out.println(str1.hashCode()); // 96354
		System.out.println(str2.hashCode()); // 96354
		
		// System.identifyHashCode(Object x)�� ObjectŬ������ hashCode �޼ҵ�ó�� ��ü �ּҰ����� �ؽ��ڵ� ����
		// ��� ��ü�� ���� �׻� �ٸ� �ؽñ��尪�� ��ȯ�� ����
		System.out.println(System.identityHashCode(str1)); // 410495873
		System.out.println(System.identityHashCode(str2)); // 811587677
	}

}