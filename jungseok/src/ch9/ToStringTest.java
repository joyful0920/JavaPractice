package ch9;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str); // KOREA
		System.out.println(str.toString()); // KOREA
		System.out.println(today); // Mon Nov 08 15:16:44 KST 2021
		System.out.println(today.toString()); // Mon Nov 08 15:16:44 KST 2021
	}

}