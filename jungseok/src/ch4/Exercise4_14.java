package ch4;

import java.util.Scanner;

// 숫자 맞추기 게임
public class Exercise4_14 {

	public static void main(String[] args) {
		// 1~100 사이의 임의 값을 얻어 answer 에 저장
		int answer = (int) (Math.random()*100)+1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		
		// 화면으로부터 사용자입력을 받기 위해 Scanner클래스 사용
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요. :");
			input = sc.nextInt(); // 입력받은 값을 변수 input에 저장
			
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;
			}
				
		} while (true); // 무한반복문
		
//		1과 100 사이의 값을 입력하세요. :50
//		더 큰 수를 입력하세요.
//		1과 100 사이의 값을 입력하세요. :80
//		더 작은 수를 입력하세요.
//		1과 100 사이의 값을 입력하세요. :70
//		더 작은 수를 입력하세요.
//		1과 100 사이의 값을 입력하세요. :60
//		더 작은 수를 입력하세요.
//		1과 100 사이의 값을 입력하세요. :55
//		더 작은 수를 입력하세요.
//		1과 100 사이의 값을 입력하세요. :52
//		더 작은 수를 입력하세요.
//		1과 100 사이의 값을 입력하세요. :51
//		맞췄습니다.
//		시도횟수는 7번입니다.
	}

}