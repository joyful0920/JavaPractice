package ch3;

public class OperatorEx32 {

	public static void main(String[] args) {

		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		// 값이 음수면 양수로 변환해서 다른 변수에 저장
		absX = x >= 0 ? x : -x;
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		// 조건 연산자를 중첩
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX); // x=+10
		System.out.printf("y=%c%d%n", signY, absY); // y=-5
		System.out.printf("z=%c%d%n", signZ, absZ); // z= 0
		
	}

}