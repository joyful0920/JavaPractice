package ch6;

class StaticBlockTest {
	static int[] arr = new int[10]; // ����� �ʱ�ȭ
	
	static { // Ŭ���� �ʱ�ȭ ��
		for (int i=0; i < arr.length; i++) {
			// 1�� 10 ������ ������ ���� �迭 arr�� ����
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public static void main(String[] args) {
		for (int i=0; i < arr.length; i++)
			System.out.println("arr[" + i +"] :" + arr[i]);
	}
	
//	arr[0] :3
//	arr[1] :3
//	arr[2] :5
//	arr[3] :7
//	arr[4] :3
//	arr[5] :10
//	arr[6] :5
//	arr[7] :8
//	arr[8] :10
//	arr[9] :6

}