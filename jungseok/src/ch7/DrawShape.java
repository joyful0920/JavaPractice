package ch7;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = { new Point(100, 100),
					  new Point(140, 50),	
					  new Point(200, 100)
					};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);
		
		t.draw(); // [p1=(100,100), p2=(140,50), p3=(200,100), color=black]
		c.draw(); // [center=(150, 150), r=50, color=black]
	}

}

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this(0,0);
	}
	
	String getXY() {
		return "(" + x + "," + y + ")";
	}
}

class Circle extends Shape { // Circle과 Shape은 상속 관계
	Point center; // Circle과 Point는 포함 관계
	int r;
	
	Circle() {
		this(new Point(0, 0), 100); // Circle(Point center, int r)를 호출
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	// Shape를 상속받았으므로 Shape의 draw()나 color 모두 사용 가능
	// Circle 내에 같은 draw()를 또 정의하면 새로 정의한 메소드가 호출됨 -> 오버라이딩
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
	
}