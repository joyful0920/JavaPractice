package ch4;

// ���ڸ� �Ųٷ� �о ������ �о ���� ȸ���� ���ϱ�
public class Exercise4_15 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while (tmp != 0) {
			result = result * 10 + tmp % 10; // ���� ����� 10�� ���ؼ� ���Ѵ�.
			tmp /= 10;
		}
		
		if (number == result)
			System.out.println(number + "�� ȸ�����Դϴ�.");
		else 
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
	}

}