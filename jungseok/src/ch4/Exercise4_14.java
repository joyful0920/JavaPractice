package ch4;

import java.util.Scanner;

// ���� ���߱� ����
public class Exercise4_14 {

	public static void main(String[] args) {
		// 1~100 ������ ���� ���� ��� answer �� ����
		int answer = (int) (Math.random()*100)+1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� ���� ���� ����
		
		// ȭ�����κ��� ������Է��� �ޱ� ���� ScannerŬ���� ���
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100 ������ ���� �Է��ϼ���. :");
			input = sc.nextInt(); // �Է¹��� ���� ���� input�� ����
			
			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
				break;
			}
				
		} while (true); // ���ѹݺ���
		
//		1�� 100 ������ ���� �Է��ϼ���. :50
//		�� ū ���� �Է��ϼ���.
//		1�� 100 ������ ���� �Է��ϼ���. :80
//		�� ���� ���� �Է��ϼ���.
//		1�� 100 ������ ���� �Է��ϼ���. :70
//		�� ���� ���� �Է��ϼ���.
//		1�� 100 ������ ���� �Է��ϼ���. :60
//		�� ���� ���� �Է��ϼ���.
//		1�� 100 ������ ���� �Է��ϼ���. :55
//		�� ���� ���� �Է��ϼ���.
//		1�� 100 ������ ���� �Է��ϼ���. :52
//		�� ���� ���� �Է��ϼ���.
//		1�� 100 ������ ���� �Է��ϼ���. :51
//		������ϴ�.
//		�õ�Ƚ���� 7���Դϴ�.
	}

}