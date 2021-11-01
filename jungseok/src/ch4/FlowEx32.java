package ch4;

import java.util.Scanner;

public class FlowEx32 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			
			System.out.println("선택하센 메뉴는 " + menu + "번입니다.");
		}
		
//		(1) square
//		(2) square root
//		(3) log
//		원하는 메뉴(1~3)를 선택하세요. (종료:0)>
//		3
//		선택하센 메뉴는 3번입니다.
//		(1) square
//		(2) square root
//		(3) log
//		원하는 메뉴(1~3)를 선택하세요. (종료:0)>
//		2
//		선택하센 메뉴는 2번입니다.
//		(1) square
//		(2) square root
//		(3) log
//		원하는 메뉴(1~3)를 선택하세요. (종료:0)>
//		4
//		메뉴를 잘못 선택하셨습니다. (종료는 0)
//		(1) square
//		(2) square root
//		(3) log
//		원하는 메뉴(1~3)를 선택하세요. (종료:0)>
//		0
//		프로그램을 종료합니다.
		
	}

}