package ch5;

import java.util.Scanner;

public class MultiArrEx1 {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int x = 0, y =0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				{0, 0, 0, 0, 0, 0, 1, 0, 0},
				{1, 1, 1, 1, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{1, 1, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 1, 1, 1, 0}
		};
		
		for (int i=1; i < SIZE; i++)
			board[0][i] = board[i][0] = (char) (i+'0');
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.printf("좌표를 입력하세요. (종료는 00)>");
			String input = sc.nextLine();
			
			if (input.length() == 2 ) {
				x = input.charAt(0) - '0'; // 문자를 숫자로 변환
				y = input.charAt(1) - '0';
				
				if (x==0 && y==0)
					break;
			}
			
			if (input.length() != 2 || x <= 0 || x >= SIZE || y <=0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			// shipBoard[x-1][y-1] 값이 1이면, 'O'을 board[x][y]에 저장
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			// 2차원 배열의 각 요소는 원래 1차원 배열이므로 1차원 배열의 참조변수만 출력하면 모든 요소 간단히 출력 가능
			for (int i=0; i < SIZE; i++) 
				System.out.println(board[i]);
			System.out.println();
		}
	}

}