package ch4;

import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("����� ������ �Է��ϼ���. (1~100)>");
		
		Scanner sc = new Scanner(System.in);
		String tep = sc.nextLine();
		score = Integer.parseInt(tep);
		
		switch (score/10) {
			case 10: case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default: 
				grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}

}