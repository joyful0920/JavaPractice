package ch6;

public class TvTest3 {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다."); // t1의 channel 값은 0입니다.
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다."); // t2의 channel 값은 0입니다.
		
		t2 = t1; // t1에 저장된 값(주소)을 t2에 저장
		t1.channel = 7;
		System.out.println("t1의 channel 값을 7로 변경하였습니다."); // t1의 channel 값을 7로 변경하였습니다.
		
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다."); // t1의 channel 값은 7입니다.
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다."); // t2의 channel 값은 7ㄴ입니다.

	}	
}