package ch4;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {
		
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. (xxxxxx-xxxxxxx)>");
		
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		
		char gender = regNo.charAt(7); // �Է� ���� ���ڿ��� 8��° ���ڸ� ����
		
		switch (gender) {
			case '1': case '3':
				System.out.println("����� �����Դϴ�.");
				break;
			case '2': case '4':
				System.out.println("����� �����Դϴ�.");
				break;
			default:
				System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");
		}

	}

}