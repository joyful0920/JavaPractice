package ch4;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>"); // 2
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		input = Integer.parseInt(tmp);
		
		if (input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		if (input!=0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�."); // �Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.
			// if �� �� ����
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input); // �Է��Ͻ� ���ڴ� 2�Դϴ�.

	}

}