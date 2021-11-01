package ch5;

import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		int[] code = {-2, -1, 4, 9, 13};
		int[] arr = new int[10];
		
		for (int i=0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * code.length);
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr)); // [-2, 13, -1, -2, 4, 13, 4, 9, 4, -2]
	}

}