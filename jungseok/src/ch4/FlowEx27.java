package ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		boolean flag = true; // while 문의 조건식으로 사용할 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		
		while(flag) {
			System.out.print(">>");
			
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num!=0) {
				sum += num;
			} else { // 0을 입력받으면 while 문 종료
				flag = false;
			}
		}
		
		System.out.println("합계:" + sum);
		
//		합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)
//		>>1
//		>>2
//		>>3
//		>>4
//		>>0
//		합계:10
		
	}

}