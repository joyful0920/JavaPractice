package ch6;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};
		
		printArr(arr); // [3,2,1,6,5,4,]
		sortArr(arr);
		printArr(arr); // [1,2,3,4,5,6,]
		System.out.println("sum=" + sumArr(arr)); // sum=21
	
	}
	
	static void printArr(int[] arr) { // 배열의 모든 요소 출력
		System.out.print("[");
		
		for (int i : arr)
			System.out.print(i + ",");
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) { // 배열의 총합 출력
		int sum = 0;
		
		for (int i=0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
	
	static void sortArr(int[] arr) { // 배열을 정렬
		for (int i=0; i < arr.length-1; i++)
			for (int j=0; j < arr.length-1-i; j++)
				 if (arr[j] > arr[j+1]) {
				 	 int tmp = arr[j];
				 	 arr[j] = arr[j+1];
					 arr[j+1] = tmp;
				 }
	}
}