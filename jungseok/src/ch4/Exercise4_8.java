package ch4;

// 2x+4y=10의 모든 해 구하기
public class Exercise4_8 {

	public static void main(String[] args) {
		for (int x=0; x<=10; x++)
			for (int y=0; y<=10; y++) {
				int result = 2*x + 4*y;
				if (result == 10)
					System.out.println("x=" + x + ", y=" + y);
			}
		
//		x=1, y=2
//		x=3, y=1
//		x=5, y=0

	}

}