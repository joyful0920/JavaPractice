package ch9;

public class StringEx3 {

	public static void main(String[] args) {
		// ���̰� 0�� char�迭 ����
		char[] cArr = new char[0]; // char[] cArr = {};
		String s = new String(cArr); // String s = new String("");
		
		System.out.println("cArr.length=" + cArr.length); // cArr.length=0
		System.out.println("@@@" + s + "@@@"); // @@@@@@
		
	}

}