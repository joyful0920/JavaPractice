package ch2;

public class CastingEx4 {

	public static void main(String[] args) {
		
		int i = 91234567; // 8�ڸ� 10����
		float f = (float)i;
		int i2 = (int)f;
		
		double d = (double)i;
		int i3 = (int)d;
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("i=%d\n", i); // i=91234567
		System.out.printf("f=%f i2=%d\n", f, i2); // f=91234568.000000 i2=91234568
		System.out.printf("d=%f i3=%d\n", d, i3); // d=91234567.000000 i3=91234567
		System.out.printf("(int)%f=%d\n", f2, i4); // (int)1.666000=1
		
	}

}