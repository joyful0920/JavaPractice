package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		int[] score = {78, 24, 12, 80, 59, 92};
		
		// �迭�� ù ��° ������ �ʱ�ȭ
		int max = score[0];
		int min = score[0];
		
		for (int i=1; i < score.length; i++) { // �迭�� �� ��° ��Һ��� �����ϱ� ���� i�� 1�� �ʱ�ȭ
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("�ִ밪 : " + max); // �ִ밪 : 92
		System.out.println("�ּҰ� : " + min); // �ּҰ� : 12
	}

}