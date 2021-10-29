package ch7;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);	
	}

}

class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D (int x, int y, int z) { // 에러 발생. Pint3D 클래스의 생ㅅ어자의 첫 줄이 생성자 호출 문장이 아니기 때문
		super(x, y); // 다음 문장을 삽입해야 함.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() { // 오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}