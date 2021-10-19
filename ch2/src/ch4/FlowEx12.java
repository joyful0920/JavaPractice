package ch4;

public class FlowEx12 {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++)
			System.out.println(i);
		// 1
		// 2
		// 3
		// 4
		// 5
		
		for (int i=1; i<=5; i++)
			System.out.print(i); // 12345

		// i 값은 6이 되지만, 조건식에 맞지 않기 때문에 출력되진 않음.
	}

}