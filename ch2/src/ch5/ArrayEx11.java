package ch5;

public class ArrayEx11 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i=0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		for (int i=0; i < numArr.length; i++) {
			System.out.println(i + "�� ���� :" + counter[i]);
		}
		
//		1971857058
//		0�� ���� :1
//		1�� ���� :2
//		2�� ���� :0
//		3�� ���� :0
//		4�� ���� :0
//		5�� ���� :2
//		6�� ���� :0
//		7�� ���� :2
//		8�� ���� :2
//		9�� ���� :1
		
	}

}