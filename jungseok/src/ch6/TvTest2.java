package ch6;

public class TvTest2 {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();
		System.out.println("t1�� channel ���� " + t1.channel + "�Դϴ�."); // t1�� channel ���� 0�Դϴ�.
		System.out.println("t2�� channel ���� " + t2.channel + "�Դϴ�."); // t2�� channel ���� 0�Դϴ�.
		
		t1.channel = 7;
		System.out.println("t1�� channel ���� 7�� �����Ͽ����ϴ�."); // t1�� channel ���� 7�� �����Ͽ����ϴ�.
		
		System.out.println("t1�� channel ���� " + t1.channel + "�Դϴ�."); // t1�� channel ���� 7�Դϴ�.
		System.out.println("t2�� channel ���� " + t2.channel + "�Դϴ�."); // t2�� channel ���� 0�Դϴ�.

	}	
}