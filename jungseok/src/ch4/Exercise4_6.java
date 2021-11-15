package ch4;

// 두 개의 주사위를 던졌을 때 눈의 합이 이 되는 모든 경우의 수를 출력
public class Exercise4_6 {

	public static void main(String[] args) {
		for (int i=1; i<=6; i++)
			for (int j=1; j<=6; j++)
				if (i+j == 6)
					System.out.println(i + "+" + j + "=" + (i+j));
		
//		1+5=6
//		2+4=6
//		3+3=6
//		4+2=6
//		5+1=6

	}

}