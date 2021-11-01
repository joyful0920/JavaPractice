package ch6;

class TV {
	// 속성(변수)
	String coclor; // 색깔
	boolean power; // 전원 상태
	int channel; // 채널
	
	// 기능(메소드)
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

public class TvTest {

	public static void main(String[] args) {
		TV t; // TV 인스턴스를 참조하기 위한 t 선언
		t = new TV(); // TV 인스턴스 생성
		t.channel = 7; // TV 인스턴스의 멤버변수 channel의 값을 7로 설정
		t.channelDown(); // TV 인스턴스의 메소드 channelDown() 호출
		System.out.println("현재 채널은 " + t.channel + "입니다."); // 현재 채널은 6입니다.
	}

}