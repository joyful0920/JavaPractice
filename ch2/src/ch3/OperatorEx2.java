package ch3;

public class OperatorEx2 {

	public static void main(String[] args) {
		
		int i=2, j=0;
		j = i++;
		System.out.println("j=i++; ���� ��, i=" + i + ", j=" + j); // j=i++; ���� ��, i=3, j=2
		
		i=2;
		j=0;
		j = ++i;
		System.out.println("j=++i; ���� ��, i=" + i + ", j=" + j); // j=++i; ���� ��, i=3, j=3
	}

}