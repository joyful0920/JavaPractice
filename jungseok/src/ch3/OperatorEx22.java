package ch3;

public class OperatorEx22 {

	public static void main(String[] args) {
		
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f  %b%n", 10.0 == 10.0f); // 10.0 == 10.0f  true
		
		// 실수형은 근사값으로 저장되므로 오차 발생
		System.out.printf("0.1 == 0.1f    %b%n", 0.1 == 0.1f); // 0.1 == 0.1f    false
		System.out.printf("f = %19.17f%n", f); // f = 0.10000000149011612
		System.out.printf("d = %19.17f%n", d); // d = 0.10000000000000000
		
		// double 형으로 변환하더라도 이미 오차 발생한 값에 0을 채울 뿐이므로 값이 바뀌진 않음.
		System.out.printf("d2 = %19.17f%n", d2); // d2 = 0.10000000149011612
		 
		System.out.printf("d == f  %b%n", d == f); // d == f  false
		System.out.printf("d == d2  %b%n", d == d2); // d == d2  false
		System.out.printf("d2 == f  %b%n", d2 == f); // d2 == f  true
		
		// float 형과 double 형의 비교는 float로 통일해야 함.
		System.out.printf("(float)d == f  %b%n", (float)d == f); // (float)d == f  true

	}

}