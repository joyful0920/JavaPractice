package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		int[] score = {78, 24, 12, 80, 59, 92};
		
		// 배열의 첫 번째 값으로 초기화
		int max = score[0];
		int min = score[0];
		
		for (int i=1; i < score.length; i++) { // 배열의 두 번째 요소부터 접근하기 위해 i를 1로 초기화
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max); // 최대값 : 92
		System.out.println("최소값 : " + min); // 최소값 : 12
	}

}