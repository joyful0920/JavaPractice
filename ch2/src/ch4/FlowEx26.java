package ch4;

public class FlowEx26 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		
		while((sum += ++i) <= 100) {
			System.out.printf("%d = %d%n", i, sum);
		}
		
//		1 = 1
//		2 = 3
//		3 = 6
//		4 = 10
//		5 = 15
//		6 = 21
//		7 = 28
//		8 = 36
//		9 = 45
//		10 = 55
//		11 = 66
//		12 = 78
//		13 = 91
		
	}

}