package ch4;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		
		int score = 0; // ������ �����ϱ� ���� ����
		char grade = ' '; // ������ �����ϱ� ���� ����. �������� �ʱ�ȭ

		System.out.print("������ �Է��ϼ���.>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >= 90) {
			grade ='A'; // score�� 90 �̻��̸� ������ A
		} else if (score >= 80) {
			grade = 'B'; // score�� 80 �̻��̸� ������ B
		} else if (score >= 70) {
			grade = 'C'; // score�� 90 �̻��̸� ������ C
		} else {
			grade = 'D'; // �̿� score�� ������ D
		}
		
		System.out.println("����� ������ " + grade +"�Դϴ�.");
	}
}