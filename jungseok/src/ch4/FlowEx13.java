package ch4;

public class FlowEx13 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum += i; // sum = sum + i
			System.out.printf("i���� %2d������ ��: %2d%n", i, sum);
		}
		
//		i����  1������ ��:  1
//		i����  2������ ��:  3
//		i����  3������ ��:  6
//		i����  4������ ��: 10
//		i����  5������ ��: 15
//		i����  6������ ��: 21
//		i����  7������ ��: 28
//		i����  8������ ��: 36
//		i����  9������ ��: 45
//		i���� 10������ ��: 55
		
	}

}