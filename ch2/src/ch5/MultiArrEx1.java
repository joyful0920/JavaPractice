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
			System.out.printf("��ǥ�� �Է��ϼ���. (����� 00)>");
			String input = sc.nextLine();
			
			if (input.length() == 2 ) {
				x = input.charAt(0) - '0'; // ���ڸ� ���ڷ� ��ȯ
				y = input.charAt(1) - '0';
				
				if (x==0 && y==0)
					break;
			}
			
			if (input.length() != 2 || x <= 0 || x >= SIZE || y <=0 || y >= SIZE) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			// shipBoard[x-1][y-1] ���� 1�̸�, 'O'�� board[x][y]�� ����
			board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';
			
			// 2���� �迭�� �� ��Ҵ� ���� 1���� �迭�̹Ƿ� 1���� �迭�� ���������� ����ϸ� ��� ��� ������ ��� ����
			for (int i=0; i < SIZE; i++) 
				System.out.println(board[i]);
			System.out.println();
		}
	}

}