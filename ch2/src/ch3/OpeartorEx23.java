package ch3;

public class OpeartorEx23 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); // "abc"=="abc" ? true
		System.out.printf(" str1==\"abc\" ? %b%n",   str1=="abc"); //  str1=="abc" ? true
		
		// ==�� ������ ���Ƶ� ��ü�� ���� �ٸ��� false ��ȯ
		System.out.printf(" str2==\"abc\" ? %b%n",   str2=="abc"); //  str2=="abc" ? false
		
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); // str1.equals("abc") ? true
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // str2.equals("abc") ? true
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); // str2.equals("ABC") ? false
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); // str2.equals("ABC") ? false

	}

}