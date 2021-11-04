package ch8;

class ExceptionEx8 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;
		//	throw new Exception("고의로 발생시켰음."); 위 두 줄을 한 줄로
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
		
//		에러 메세지 : 고의로 발생시켰음.
//		java.lang.Exception: 고의로 발생시켰음.
//			at ch8.ExceptionEx8.main(ExceptionEx8.java:7)
//		프로그램이 정상 종료되었음.

	}

}