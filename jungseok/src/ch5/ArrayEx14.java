package ch5;

public class ArrayEx14 {

	public static void main(String[] args) {
		
		String src = "ABCDE";
		
		for (int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "):" + ch);
			
//			src.charAt(0):A
//			src.charAt(1):B
//			src.charAt(2):C
//			src.charAt(3):D
//			src.charAt(4):E
			
		}
		
		char[] chArr = src.toCharArray();
		
		System.out.println(chArr); // ABCDE
	}

}