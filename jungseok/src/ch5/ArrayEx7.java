package ch5;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]); // 0123456789
		}
		System.out.println();
		
		for (int i=0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			// tmp를 이용해서 numArr[0]과 numArr[n]을 서로 바꾸기
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for (int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i]); // 6047859123
		}
		
	}

}