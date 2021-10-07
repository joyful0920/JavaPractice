package ch3;

public class OperatorEx9 {

	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		// int 타입끼리 연산 후 형변환을 안하면 long 타입에 담아도 오버플로우된 값 출력
		System.out.println("a = " + a); // a = -727379968
		
		// int 와 long 타입의 연산은 long 타입으로 자동 산술변환 되기 때문에 원하는 값 출력 가능
		System.out.println("b = " + b); // b = 1000000000000
		
	}

}