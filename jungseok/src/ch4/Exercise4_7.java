package ch4;

// Math.random()�� �̿��ؼ� 1���� 6������ ������ ������ ���� value�� ����
public class Exercise4_7 {

	public static void main(String[] args) {
		int value = (int) (Math.random()*6)+1;
		
		System.out.println("value:"+value);
	}

}