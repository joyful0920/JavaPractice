package ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		boolean flag = true; // while ���� ���ǽ����� ����� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)");
		
		while(flag) {
			System.out.print(">>");
			
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num!=0) {
				sum += num;
			} else { // 0�� �Է¹����� while �� ����
				flag = false;
			}
		}
		
		System.out.println("�հ�:" + sum);
		
//		�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)
//		>>1
//		>>2
//		>>3
//		>>4
//		>>0
//		�հ�:10
		
	}

}