package ch7;

class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f�� Unit Ŭ������ �ڼ��Դϴ�.");
		
		// Figtable�� Movable�� Attackable�� ��ӹޱ� ������..
		if (f instanceof Fightable)
			System.out.println("f�� Fightable �������̽��� �����߽��ϴ�.");
		
		if (f instanceof Movable)
			System.out.println("f�� Movable �������̽��� �����߽��ϴ�.");
		
		if (f instanceof Attackable)
			System.out.println("f�� Attackable �������̽��� �����߽��ϴ�.");
		
		// Object Ŭ������ ��ӹ޴� Unit�� ��ӹޱ� ������..
		if (f instanceof Object)
			System.out.println("f�� Object Ŭ������ �ڼ��Դϴ�.");
	}

}

class Fighter extends Unit implements Fightable {
	// �������̵��� �� ���󺸴� ���� ������ ���� ������ ���� �ʿ�
	public void move(int x, int y) { }
	public void attack(Unit u) { }
}

class Unit {
	int currentHP;
	int x, y;
}

interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y); } // public abstract�� ������ �޼ҵ�
interface Attackable { void Attack(Unit u); } // public abstract�� ������ �޼ҵ�