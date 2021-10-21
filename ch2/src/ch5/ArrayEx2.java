package ch5;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 90, 80, 70, 60};
		int[] iArr3 = {100, 90, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for (int i=0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;
		}
		
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int) (Math.random() * 10) + 1;
		}
		
		for (int i=0; i < iArr1.length; i++) {
			System.out.print(iArr1[i] + ", "); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2)); // [8, 4, 4, 1, 2, 1, 1, 7, 9, 3]
		System.out.println(Arrays.toString(iArr3)); // [100, 90, 80, 70, 60]
		System.out.println(Arrays.toString(chArr)); // [a, b, c, d]
		System.out.println(iArr3); // [I@458c1321
		System.out.println(chArr); // abcd
		
	}

}