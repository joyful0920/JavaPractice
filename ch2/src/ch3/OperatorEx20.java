package ch3;

public class OperatorEx20 {

	public static void main(String[] args) {
		
		// 부호 연산자를 무시하고 연산 뒤, 결과 값에 다시 붙인다.
		System.out.println(-7%2); // -1
		
		// 나누는 수의 부호는 무시하고 연산됨.
		System.out.println(7%-2); // 1
		System.out.println(-7%-2); // -1

	}

}