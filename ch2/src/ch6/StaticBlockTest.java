package ch6;

class StaticBlockTest {
	static int[] arr = new int[10]; // 명시적 초기화
	
	static { // 클래스 초기화 블럭
		for (int i=0; i < arr.length; i++) {
			// 1과 10 사이의 임의의 값을 배열 arr에 저장
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