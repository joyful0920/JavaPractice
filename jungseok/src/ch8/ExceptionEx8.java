package ch8;

class ExceptionEx8 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������.");
			throw e;
		//	throw new Exception("���Ƿ� �߻�������."); �� �� ���� �� �ٷ�
		} catch (Exception e) {
			System.out.println("���� �޼��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
		
//		���� �޼��� : ���Ƿ� �߻�������.
//		java.lang.Exception: ���Ƿ� �߻�������.
//			at ch8.ExceptionEx8.main(ExceptionEx8.java:7)
//		���α׷��� ���� ����Ǿ���.

	}

}