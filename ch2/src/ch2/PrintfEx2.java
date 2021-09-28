package ch2;

public class PrintfEx2 {

	public static void main(String[] args) {
		
		String url = "www.joyfuls.xyz";
		
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 0.10, 1.0e-1
		float f3 = 2.56e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // f1=0.100000, 1.000000e-01, 0.100000
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); // f2=10.000000, 1.000000e+01, 10.0000
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); // f3=2560.000000, 2.560000e+03, 2560.00
		
		System.out.printf("d=%f%n", d); // d=1.234568
		// 전세 14자리 중 소수점 아래 10자리까지만으로 지정
		System.out.printf("d=%14.10f%n", d); // d=  1.2345678900
		// 양쪽 빈자리를 모두 0으로 채우기
		System.out.printf("d=%014.10f%n", d); // d=001.2345678900
		
		System.out.printf("[12345678901234567890]%n"); // [12345678901234567890]
		System.out.printf("[%s]%n", url); // [www.joyfuls.xyz]
		// 오른쪽 정렬. 최소 20글자 출력공간 확보
		System.out.printf("[%20s]%n", url); // [     www.joyfuls.xyz]
	  // 왼쪽 정렬. 최소 20글자 출력공간 확보
		System.out.printf("[%-20s]%n", url); // [www.joyfuls.xyz     ]
		// 왼쪽에서 8글자만 출력
		System.out.printf("[%.8s]%n", url); // [www.joyf]

	}

}