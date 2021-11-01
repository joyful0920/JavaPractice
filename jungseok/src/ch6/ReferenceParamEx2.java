package ch6;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] x = {10};
		System.out.println("main() : x = " + x[0]); // main() : x = 10
		
		change(x); // change() : x = 1000
		System.out.println("After change(x)"); // After change(x)
		
		// 배열도 객체와 같이 참조변수를 톹ㅇ해 데이터에 저장된 공간에 접근
		System.out.println("main() : x = " + x[0]); // main() : x = 1000
	
	}
	
	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}

}