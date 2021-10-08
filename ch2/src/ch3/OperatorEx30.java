package ch3;

public class OperatorEx30 {
	
	static String toBinaryString(int x) { // 10진 정수를 2진수로 변환하는 메소드
		
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

	public static void main(String[] args) {

		int dec = 8;
		
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0)); // 8 >> 0 =    8 	00000000000000000000000000001000
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1)); // 8 >> 1 =    4 	00000000000000000000000000000100
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2)); // 8 >> 2 =    2 	00000000000000000000000000000010
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0)); // 8 << 0 =    8 	00000000000000000000000000001000
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1)); // 8 << 1 =   16 	00000000000000000000000000010000
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2)); // 8 << 2 =   32 	00000000000000000000000000100000
		
		dec = -8;
		
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0)); // -8 >> 0 =   -8 	11111111111111111111111111111000
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1)); // -8 >> 1 =   -4 	11111111111111111111111111111100
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2)); // -8 >> 2 =   -2 	11111111111111111111111111111110
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0)); // -8 << 0 =   -8 	11111111111111111111111111111000
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1)); // -8 << 1 =  -16 	11111111111111111111111111110000
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2)); // -8 << 2 =  -32 	11111111111111111111111111100000
		
		dec = 8;
		
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0)); // 8 >> 32 =    8 	00000000000000000000000000001000
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32)); // 8 >> 32 =    8 	00000000000000000000000000001000
	}

}