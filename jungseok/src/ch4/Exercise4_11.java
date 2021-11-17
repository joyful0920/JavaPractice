package ch4;

// 1과 1부터 시작하는 피보나치 수열의 10번째 수 계산
public class Exercise4_11 {

	public static void main(String[] args) {
		// 피보나치 수열의 시작의 첫 두 숫자는 1, 1
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1 + "," + num2);
		
		for (int i=0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			
			num1 = num2;
			num2 = num3;
		}
		
//		1,1,2,3,5,8,13,21,34,55
	}

}