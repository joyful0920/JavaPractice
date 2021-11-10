package ch9;

public class StringEx6 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum); // 100+200.0=300.0
		System.out.println(strVal + "+" + strVal2 + "=" + sum2); // 100+200.0=300.0
	}

}