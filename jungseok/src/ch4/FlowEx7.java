package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {

		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		// 0.0�� 1.0 ���� ������ double�� ��ȯ
		// int������ ��ȯ ��, �Ҽ������� ���� ���� ó��
		int com = (int) (Math.random() * 3) + 1; // 1, 2, 3 �� �ϳ��� com�� �����.
		
		System.out.println("����� " + user + "�Դϴ�.");
		System.out.println("COM�� " + com + "�Դϴ�.");
		
		switch (user-com) {
			case 2: case -1:
				System.out.println("����� �����ϴ�.");
				break;
			case 1: case -2:
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
		}
	}

}