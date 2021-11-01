package ch5;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);
		
		// �迭�� ��� ��Ҹ� 1���� SIZE*SIZE������ ���ڷ� �ʱ�ȭ
		for (int i=0; i < SIZE; i++)
			for (int j=0; j < SIZE; j++)
				bingo[i][j] = i * SIZE + j + 1;
		
		// �迭�� ����� �� ����
		for (int i=0; i < SIZE; i++) {
			for (int j=0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for (int i=0; i < SIZE; i++) {
				for (int j=0; j < SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d�� ���ڸ� �Է��ϼ���. (����:0)>", SIZE*SIZE);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			// �Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0�� ����
			outer:
			for (int i=0; i < SIZE; i++) {
				for (int j=0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer;
					}
				}
			}
		} while(num != 0);
		
//		13  2  4  7 18 
//		21 11  3 12 20 
//		 9 22 19 24 25 
//		 8 23  6  5  1 
//		10 14 17 16 15 
//
//		1~25�� ���ڸ� �Է��ϼ���. (����:0)>3
//		13  2  4  7 18 
//		21 11  0 12 20 
//		 9 22 19 24 25 
//		 8 23  6  5  1 
//		10 14 17 16 15 
//
//		1~25�� ���ڸ� �Է��ϼ���. (����:0)>4
//		13  2  0  7 18 
//		21 11  0 12 20 
//		 9 22 19 24 25 
//		 8 23  6  5  1 
//		10 14 17 16 15 
//
//		1~25�� ���ڸ� �Է��ϼ���. (����:0)>
		
	}

}