package ch4;

// 숫자로 된 문자열의 각 자리 합을 더한 결과 구하기
public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for (int i=0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println("sum=" + sum); // sum=15
	}

}