package ch7;

class InnerEx1 {
	
	class InstanceInner {
		int iv = 100;
	//	static int cv = 100; 에러! static 변수 선언 불가
		final static int CONST = 100; // final static은 상수이므로 허용
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static 클래스만 static 멤버 정의 가능
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
		//	static int cv = 100; 에러! static 변수 선언 불가
			final static int CONST = 100; // final static은 상수이므로 허용
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST); // 100
		System.out.println(StaticInner.cv); // 200
	}

}