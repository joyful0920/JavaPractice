package ch6;

public class VarArgsEx {

	public static void main(String[] args) {
		String[] strArr = { "100", "200", "300" };
		
		System.out.println(concatenate("", "100", "200", "300")); // 100200300
		System.out.println(concatenate("-", strArr)); // 100-200-300-
		System.out.println(concatenate(",", new String[] {"1", "2", "3"})); // 1,2,3,
		System.out.println("[" + concatenate(",", new String[0])+"]"); // []
		System.out.println("[" + concatenate(",")+"]"); // []
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for (String str : args) {
			result += str + delim;
		}
		
		return result;
	}

	// 가변 인자를 사용한 메소드는 오버로딩하면 오류 발생위험이 크다.
//	static String concatenate(String... args) {
//		return concatenate("", args);
//	}

}