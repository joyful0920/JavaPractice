package ch4;

import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���. (��:12345)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while (num!=0) {
			// �� �ڸ� ���� ���� ���ϱ� ���� �Է��� ���� 10���� ���� �������� �������� 0�� �� �� ���� �ݺ��ϸ鼭 ����.
			sum += num%10; // sum = sum + num%10
			System.out.printf("sum = %3d num=%d%n", sum, num);
			
			num /= 10;
		}
		
		System.out.println("�� �ڸ����� ��:" + sum);
		
//		���ڸ� �Է��ϼ���. (��:12345)>12345
//		sum =   5 num=12345
//		sum =   9 num=1234
//		sum =  12 num=123
//		sum =  14 num=12
//		sum =  15 num=1
//		�� �ڸ����� ��:15

	}

}