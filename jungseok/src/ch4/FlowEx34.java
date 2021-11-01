package ch4;

import java.util.Scanner;

public class FlowEx34 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (����� 0)");
				continue;
			}
			
			for(;;) {
				System.out.print("����� ���� �Է��ϼ���. (��� ����:0, ��ü ����:99)>");
				
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if (num==0)
					break; // ��� ����
				if (num==99)
					break outer; // ��ü ����
				
				switch (menu) {
					case 1:
						System.out.println("result=" + num*num);
						break;
					case 2:
						System.out.println("result=" + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result=" + Math.log(num));
						break;
				}
			}
			
		}
		
//		(1) square
//		(2) square root
//		(3) log
//		���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>1
//		����� ���� �Է��ϼ���. (��� ����:0, ��ü ����:99)>4
//		result=16
//		����� ���� �Է��ϼ���. (��� ����:0, ��ü ����:99)>0
//		(1) square
//		(2) square root
//		(3) log
//		���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>3
//		����� ���� �Է��ϼ���. (��� ����:0, ��ü ����:99)>99
		
	}

}