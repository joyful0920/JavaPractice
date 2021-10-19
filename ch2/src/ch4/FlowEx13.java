package ch4;

public class FlowEx13 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			sum += i; // sum = sum + i
			System.out.printf("i부터 %2d까지의 합: %2d%n", i, sum);
		}
		
//		i부터  1까지의 합:  1
//		i부터  2까지의 합:  3
//		i부터  3까지의 합:  6
//		i부터  4까지의 합: 10
//		i부터  5까지의 합: 15
//		i부터  6까지의 합: 21
//		i부터  7까지의 합: 28
//		i부터  8까지의 합: 36
//		i부터  9까지의 합: 45
//		i부터 10까지의 합: 55
		
	}

}