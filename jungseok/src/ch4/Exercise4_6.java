package ch4;

// �� ���� �ֻ����� ������ �� ���� ���� �� �Ǵ� ��� ����� ���� ���
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