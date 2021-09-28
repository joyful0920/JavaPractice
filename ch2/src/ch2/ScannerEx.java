package ch2;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두자리수 정수 하나를 입력하세요.>");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력 내용 : " + input);
		System.out.printf("num=%d%n", num);
		
	}

}