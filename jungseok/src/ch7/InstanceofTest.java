package ch7;

class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance."); // This is a FireEngine instance.
		}
		
		// FireEngine 클래스는 Ojbect와 Car의 자손이므로 해당 인스턴스들을 포함하고 있는 셈
		// 그래서 instanceof 연산 결과가 모두 true
		// true라는 건 해당 타입으로 형변환해도 문제없다는 뜻
		if (fe instanceof Car) {
			System.out.println("This is a Car instance."); // This is a Car instance.
		}
		
		if (fe instanceof Object) {
			System.out.println("This is an Object instance."); // This is an Object instance.
		
		// 참조변수가 가리키고 있는 인스턴스으 ㅣ클래스 이름을 문자열로 반환
		System.out.println(fe.getClass().getName()); // 클래스 이름 출력 FireEngine
	}

}

class Car { }
class FireEngine extends Car { }