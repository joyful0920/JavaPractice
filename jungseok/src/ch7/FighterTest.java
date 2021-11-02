package ch7;

class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f는 Unit 클래스의 자손입니다.");
		
		// Figtable이 Movable과 Attackable을 상속받기 때문에..
		if (f instanceof Fightable)
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		
		if (f instanceof Movable)
			System.out.println("f는 Movable 인터페이스를 구현했습니다.");
		
		if (f instanceof Attackable)
			System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
		
		// Object 클래스를 상속받는 Unit를 상속받기 때문에..
		if (f instanceof Object)
			System.out.println("f는 Object 클래스의 자손입니다.");
	}

}

class Fighter extends Unit implements Fightable {
	// 오버라이딩할 땐 조상보다 넓은 범위의 접근 제어자 지정 필요
	public void move(int x, int y) { }
	public void attack(Unit u) { }
}

class Unit {
	int currentHP;
	int x, y;
}

interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y); } // public abstract가 생략된 메소드
interface Attackable { void Attack(Unit u); } // public abstract가 생략된 메소드