package ch3;

public class OperatorEx12 {

	public static void main(String[] args) {
		
		char c1 = 'a';
		char c2 = c1;
		char c3 = ' ';
		
		int i = c1 + 1; // 'a' + 1 -> 97 + 1 -> 98
		
		c3 = (char)(c1 + 1); // int 형 결과를 char 형에 저장하기 위해선 형변환 필요
		c2++;
		c2++;
		
		System.out.println("i = " + i); // 98
		System.out.println("c2 = " + c2); // c
		System.out.println("c3 = " + c3); // b

	}

}