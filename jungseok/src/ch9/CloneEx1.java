package ch9;

// clone() 사용을 위해 복제할 클래스는 Cloneable 인터페이스 구현이 반드시 필요
// 인스턴스 데이터를 보호하기 위한 장치
//class Point implements Cloneable {
//	int x, y;
//	
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public String toString() {
//		return "x=" + x + ", y=" + y;
//	}
//	
//	// clone 오버라이딩을 위해선 접근 제어자를 public으로 변경 필요
//	// 그래야 상속관계가 없는 다른 클래스에서 clone() 호출 가능
//	public Object clone() {
//		Object obj = null;
//		
//		// 조상 클래스의 clone()을 호출하는 try-catch문
//		try {
//			obj = super.clone(); // clone()은 반드시 예외처리 필요
//		} catch (CloneNotSupportedException e) {}
//		
//		return obj;
//	}
//}

public class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone(); // 복제해서 새로운 객체 생성
		System.out.println(original);
		System.out.println(copy);
	}

}