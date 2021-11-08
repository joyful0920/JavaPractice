package ch9;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2)); // true
		
		// String 클래스는 문자열 내용이 같으면,
		// 동일한 해시코드를 반환하도록 hashCode 메소드가 오버라이딩 돼있음.
		System.out.println(str1.hashCode()); // 96354
		System.out.println(str2.hashCode()); // 96354
		
		// System.identifyHashCode(Object x)는 Object클래스의 hashCode 메소드처럼 객체 주소값으로 해시코드 생성
		// 모든 객체에 대해 항상 다른 해시콬드값을 반환을 보장
		System.out.println(System.identityHashCode(str1)); // 410495873
		System.out.println(System.identityHashCode(str2)); // 811587677
	}

}