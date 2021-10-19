package ch4;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {

		int input = 0, answer = 0;
		
		answer = (int) (Math.random() * 100) + 1; // 1~100 사이의 임의의 정수 저장
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input != answer);
		
		System.out.println("정답입니다.");
		
//		1과 100사이의 정수를 입력하세요.>22
//		더 작은 수로 다시 시도해보세요.
//		1과 100사이의 정수를 입력하세요.>10
//		더 큰 수로 다시 시도해보세요.
//		1과 100사이의 정수를 입력하세요.>17
//		더 작은 수로 다시 시도해보세요.
//		1과 100사이의 정수를 입력하세요.>14
//		더 작은 수로 다시 시도해보세요.
//		1과 100사이의 정수를 입력하세요.>13
//		더 작은 수로 다시 시도해보세요.
//		1과 100사이의 정수를 입력하세요.>11
//		정답입니다.
		
	}

}