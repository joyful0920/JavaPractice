package ch6;

public class MyMathTest {

	public static void main(String[] args) {
		// 인스턴스 생성
		MyMath mm = new MyMath();
		
		// 메소드 호출
		// 반환된 결과 변수에 저장
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // double 대신 long 값으로 호출하였으므로, double로 자동 형변환됨.
		
		System.out.println("add(5L, 3L) = " + result1); // add(5L, 3L) = 8
		System.out.println("subtact(5L, 3L) = " + result2); // subtact(5L, 3L) = 2
		System.out.println("multiply(5L, 3L) = " + result3); // multiply(5L, 3L) = 8
		System.out.println("divide(5L, 3L) = " + result4); // divide(5L, 3L) = 1.6666666666666667
		 
	}

}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
//		return a + b; 위 두 줄을 간단히 표현 가능
	}	
		long subtract(long a, long b) { return a - b; }
		long multiply(long a, long b) { return a + b; }
		double divide(double a, double b) { return a / b; }
}