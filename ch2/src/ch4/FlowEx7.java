package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {

		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		// 0.0과 1.0 사이 임의의 double값 반환
		// int형으로 변환 시, 소숫점이하 값은 버림 처리
		int com = (int) (Math.random() * 3) + 1; // 1, 2, 3 중 하나가 com에 저장됨.
		
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("COM은 " + com + "입니다.");
		
		switch (user-com) {
			case 2: case -1:
				System.out.println("당신은 졌습니다.");
				break;
			case 1: case -2:
				System.out.println("당신은 이겼습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
		}
	}

}