package ch4;

// int 타입의 변수의 각 자리 합을 더한 결과 출력
public class Exercise4_10 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("sum=" + sum); // sum=15
	}

}