package ch2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ��� ���� �ϳ��� �Է��ϼ���.>");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("�Է� ���� : " + input);
		System.out.printf("num=%d%n", num);
		
	}

}