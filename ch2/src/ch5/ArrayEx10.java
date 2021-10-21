package ch5;

public class ArrayEx10 {

	public static void main(String[] args) {

		int[] numArr = new int[10];
		
		for (int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();
		
		for (int i=0; i < numArr.length-1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지 체크
			
			for (int j=0; j < numArr.length-1; j++) {
				if (numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; // 자리바꿈이 발생했으면 changed를 true로
				}
			}
			
			if (!changed) break; // 자리바꿈이 없으면 반복문 탈출
			
			for (int k=0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
		
//		4974202813
//		4742028139
//		4420271389
//		4202413789
//		2024134789
//		0221344789
//		0212344789
//		0122344789
		
	}

}