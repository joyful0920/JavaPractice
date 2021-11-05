package ch8;

public class FinallyTest3 {

	public static void main(String[] args) {
		// method1()은 static 메소드이므로 인스턴스 생성없이 직접 호출 가능
		FinallyTest3.method1();
		System.out.println("method1()의 수행을 마치고 main메소드로 돌아왔습니다.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return; // 현재 실행 중인 메소드 종료
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1(U)의 finally 불럭이 실행되었습니다.");
		}
	}
}