package ch3;

public class OperatorEx28 {
	
	static String toBinaryString(int x) { // 10진 정수를 2진수로 변환하는 메소드
		
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

	public static void main(String[] args) {
		
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x)); // x = 0XAB 		00000000000000000000000010101011
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y)); // y = 0XF 		00000000000000000000000000001111
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y)); // 0XAB | 0XF = 0XAF 	00000000000000000000000010101111
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y)); // 0XAB & 0XF = 0XB 	00000000000000000000000000001011
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y)); // 0XAB ^ 0XF = 0XA4 	00000000000000000000000010100100
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y)); //  =0XAB ^ 0XF ^ 0XF = 0XAB 00000000000000000000000010101011

	} 

}