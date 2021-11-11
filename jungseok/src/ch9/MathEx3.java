package ch9;

public class MathEx3 {

	public static void main(String[] args) {
		int x1=1, y1=1;
		int x2=2, y2=2;
		
		double c = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // 두 지점 간의 거리 계싼
		double a = c * Math.sin(Math.PI/4); // PI/4 rad = 45 degree 
		double b = c * Math.cos(Math.PI/4);
//		double b = c * Math.cos(toRadians(45)); // 각도를 라디안으로 변환
		
		System.out.printf("a=%f%n", a); // a=1.000000
		System.out.printf("b=%f%n", b); // b=1.000000
		System.out.printf("c=%f%n", c); // c=1.414214
		
		// 삼각함수는 매개변수 단위가 라디안이므로, 45도를 라디안 단위 값으로 변환 필요
		// 직각 삼각형 두 변에 끼인각을 구하기 위해 atan2() 사용
		// 디그리로 변환하기 위해 180 / PI를 곱하거나 toDegrees() 사용
		System.out.printf("angle=%f rad%n", Math.atan2(a,b)); // angle=0.785398 rad
		System.out.printf("angle=%f degree%n%n", Math.atan2(a,b) * 180 / Math.PI); // angle=45.000000 degree
//		System.out.printf("angle=%f degree%n%n", Math.toDegrees(Math.atan2(a,b)));
		
		// 24자리의 2진수를 10진수로 변환하기 위해 상용로그를 적용하는 메소드 사용
		System.out.printf("24 * log10(2)=%f%n", 24 * Math.log10(2)); // 24 * log10(2)=7.224720
		System.out.printf("53 * log10(2)=%f%n%n", 53 * Math.log10(2)); // 53 * log10(2)=15.954590
		
	}

}