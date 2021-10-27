package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(5); // 같은 클래스 내 메소드이기 때문에 호출 시 클래스 이름 생략 가능
		
		System.out.println(result); // 120
	}
	
	static int factorial(int n) { // static 이므로 인스턴스를 생성하지 않고 바로 호출 가능
		int result = 0;
		
		if (n == 1 )
			result = 1;
		else 
			result = n * factorial(n-1); // 재귀 호출
		
		return result;
	}
	

	// 간편화 메소드 버전
//	static int factorial (int n) {
//		if (n == 1) return 1;
//		
//		return n * factorial(n-1);
//	}

}