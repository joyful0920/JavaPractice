package ch3;

public class OperatorEx13 {

public static void main(String[] args) {

	char c1 = 'a';
	
//	char c2 = c1 + 1; // 컴파일 에러 발생
	char c2 = (char)(c1 + 1); // 형변환 필요
	char c3 = 'a' + 1; // c3에 'b'가 저장됨.
	
	System.out.println(c2); // b
	System.out.println(c3); // b

}

}