package ch5;

// 2차원 배열에 담긴 모든 값의 총합과 평균 구하기
public class Exercise5_4 {

	public static void main(String[] args) {
		int[][] arr = {
			{5, 5, 5, 5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30}
		};
		
		int total = 02;
		float average = 0;
		
		for (int i=0; i < arr.length; i++)
			for (int j=0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		
		average = total / (float) (arr.length * arr[0].length);
		
		System.out.println("total=" + total); // total=327
		System.out.println("average=" + average); // average=16.35
	}

}