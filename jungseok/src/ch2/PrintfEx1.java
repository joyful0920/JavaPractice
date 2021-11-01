package ch2;

public class PrintfEx1 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'B';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8진수 10, 10진수로 8
		int hexNum = 0x10; // 16진수 10, 10진수로 16
		int binNum = 0b10; // 2진수 10. 10진수로 2
		
		System.out.printf("b=%d%n", b); // b=11
		System.out.printf("s=%d%n", s); // s=2
		System.out.printf("c=%c, %d %n", c, (int)c); // c=B, 66
		
		System.out.printf("finger=[%5d]%n", finger); // finger=[   10]
		System.out.printf("finger=[%-5d]%n", finger); // finger=[10   ]
		System.out.printf("finger=[%05d]%n", finger); // finger=[00010]
		
		System.out.printf("big=%d%n", big); // big=100000000000
		// #x는 접두사(16진수 0x, 8진수 0)
		System.out.printf("hex=%#x%n", hex); // hex=0xffffffffffffffff
		System.out.printf("hex=%#X%n", hex); // hex=0xFFFFFFFFFFFFFFFF
		
		System.out.printf("octNum=%o, %d%n", octNum, octNum); // octNum=10, 8
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // hexNum=10, 16
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // binNum=10, 2

	}

}