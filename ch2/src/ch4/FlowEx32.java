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
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (����� 0)");
				continue;
			}
			
			System.out.println("�����ϼ� �޴��� " + menu + "���Դϴ�.");
		}
		
//		(1) square
//		(2) square root
//		(3) log
//		���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>
//		3
//		�����ϼ� �޴��� 3���Դϴ�.
//		(1) square
//		(2) square root
//		(3) log
//		���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>
//		2
//		�����ϼ� �޴��� 2���Դϴ�.
//		(1) square
//		(2) square root
//		(3) log
//		���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>
//		4
//		�޴��� �߸� �����ϼ̽��ϴ�. (����� 0)
//		(1) square
//		(2) square root
//		(3) log
//		���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>
//		0
//		���α׷��� �����մϴ�.
		
	}

}