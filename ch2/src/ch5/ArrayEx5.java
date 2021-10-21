package ch5;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 90, 80, 70, 60}; 
		
		for (int i=0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float) score.length; // 계산 결과를 float로 얻기 위한 형변환
		
		System.out.println("총점 : " + sum); // 400
		System.out.println("평균 : " + average); // 80.0
	}

}