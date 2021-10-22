package ch5;

public class ArrayEx16 {

	public static void main(String[] args) {
		
		int[][] score = {
							{100, 100, 100}, 
							{20, 20, 20},
							{30, 30, 30},
							{40, 40, 40},
						};
		
		int sum = 0;
		
		for (int i=0; i < score.length; i++) {
			for (int j=0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		// 향상된 for 문으로 2차원 1ㅐ열 score의 모든 요소 합 구하기
		// score의 각 요소를 1차월 배열 tmp에 저장
		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println("sum="+sum); 
		
//		score[0][0]=100
//		score[0][1]=100
//		score[0][2]=100
//		score[1][0]=20
//		score[1][1]=20
//		score[1][2]=20
//		score[2][0]=30
//		score[2][1]=30
//		score[2][2]=30
//		score[3][0]=40
//		score[3][1]=40
//		score[3][2]=40
//		sum=570

	}

}