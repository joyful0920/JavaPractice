package ch4;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		
		int score = 0; // 점수를 저장하기 위한 변수
		char grade = ' '; // 학점을 저장하기 위한 변수. 공백으로 초기화

		System.out.print("점수를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >= 90) {
			grade ='A'; // score가 90 이상이면 학점은 A
		} else if (score >= 80) {
			grade = 'B'; // score가 80 이상이면 학점은 B
		} else if (score >= 70) {
			grade = 'C'; // score가 90 이상이면 학점은 C
		} else {
			grade = 'D'; // 이외 score의 학점은 D
		}
		
		System.out.println("당신의 학점은 " + grade +"입니다.");
	}
}