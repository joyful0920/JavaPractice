package ch9;

public class StringEx3 {

	public static void main(String[] args) {
		// 길이가 0인 char배열 생성
		char[] cArr = new char[0]; // char[] cArr = {};
		String s = new String(cArr); // String s = new String("");
		
		System.out.println("cArr.length=" + cArr.length); // cArr.length=0
		System.out.println("@@@" + s + "@@@"); // @@@@@@
		
	}

}