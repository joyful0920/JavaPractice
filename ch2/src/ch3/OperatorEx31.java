package ch3;

public class OperatorEx31 {

	public static void main(String[] args) {

		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%X%n", hex); // hex=ABCD
		
		// 1010101111001101 & 0000000000001111 -> 0000000000001101
		System.out.printf("%X%n", hex & mask); // D
		
		hex = hex >> 4; // 1010101111001101 -> 0000101010111100
		System.out.printf("%X%n", hex & mask); // C
		
		hex = hex >> 4; // 0000101010111100 -> 0000000010101011
		System.out.printf("%X%n", hex & mask); // B
		
		hex = hex >> 4; // 0000000010101011 -> 0000000000001010
		System.out.printf("%X%n", hex & mask); // A
		
	}

}