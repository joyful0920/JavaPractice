package ch3;

public class OperatorEx6 {

	public static void main(String[] args) {
		
		byte a = 12;
		byte b = 22;
		byte c = a + b; // 에러. byte 끼리의 연산은 int 형으로 자동 변환된 후 연산되기 때문에 결과 값도 int형
		byte d = (byte) (a + b); // int 형으로 자동 형변환된 값을 byte에 저장하고 있으면 byte형으로 형변환 필요
		System.out.println(c);

	}

}