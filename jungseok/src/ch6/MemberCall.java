package ch6;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; 에러. 클래스 변수는 인스턴스 변수 사용 불가능
	static int cv2 = new MemberCall().iv; // 인스턴스를 생성해야 사용 가능

	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); 에러. 클래스 메소드에서 인스턴스 변수 사용 불가능
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체 생성 후 인스턴스 변수 참조 가능
	}
		
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 인스턴스 메소드에선 인스턴스 변수 바로 사용 가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // 에러. 클래스 메소드에선 인스턴스 메소드 호출 불가능
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스 생성 후 호출 가능
		
		// 한줄로 표현도 가능
		new MemberCall().instanceMethod1(); // 대신 참조 변수를 선언하지 않았으므로, 생성된 인스턴스는 일회용
	}
	
	void instanceMethod2() { // 인스턴스 메소드에선 클래스 메소드와 인스턴스 메소드 모두 바로 호출 가능
		staticMethod1();
		instanceMethod1();
	}

}