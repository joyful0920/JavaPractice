package ch9;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) { 
		// 배열도 객체이기 때문에 Object 클래스를 상속받으며,
		// Cloneable 인터페이스와 Serializable 인터페이스가 구현되어 있음.
		int[] arr = {1, 2, 3, 4, 5};
		// Object 클래스에는 protected로 정의되어 있는 clone()을 배열에서는 public으로 오버라이딩했기 때문에 직접 호출 가능
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arrClone)); // [6, 2, 3, 4, 5]
	}

}