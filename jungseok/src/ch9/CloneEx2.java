package ch9;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) { 
		// �迭�� ��ü�̱� ������ Object Ŭ������ ��ӹ�����,
		// Cloneable �������̽��� Serializable �������̽��� �����Ǿ� ����.
		int[] arr = {1, 2, 3, 4, 5};
		// Object Ŭ�������� protected�� ���ǵǾ� �ִ� clone()�� �迭������ public���� �������̵��߱� ������ ���� ȣ�� ����
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arrClone)); // [6, 2, 3, 4, 5]
	}

}