package ch7;

class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; // 외부 클래스의 private 멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// 스태틱 클래스는 외부 인스턴스 멤버에 접근 불가
	//  int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; // JDK 1.8부터 final 생략 가능
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능
		//	int liv3 = liv; // 에러!!! (JDK 1.8부터 에러 ㄴㄴ)
			int liv4 = LV; // OK
		}
	}

}