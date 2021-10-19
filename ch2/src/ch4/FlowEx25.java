package ch4;

import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {
		
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요. (예:12345)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while (num!=0) {
			// 각 자리 수의 합을 구하기 위해 입력한 수를 10으로 나눈 나머지를 나머지가 0이 될 때 까지 반복하면서 더함.
			sum += num%10; // sum = sum + num%10
			System.out.printf("sum = %3d num=%d%n", sum, num);
			
			num /= 10;
		}
		
		System.out.println("각 자리수의 합:" + sum);
		
//		숫자를 입력하세요. (예:12345)>12345
//		sum =   5 num=12345
//		sum =   9 num=1234
//		sum =  12 num=123
//		sum =  14 num=12
//		sum =  15 num=1
//		각 자리수의 합:15

	}

}