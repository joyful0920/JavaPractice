package ch8;

class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ�
			copyFiles(); // ���� ����
		} catch (SpaceException e) {
			System.out.println("���� �޼��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		} catch (MemoryException me) {
			System.out.println("���� �޼��� : " + me.getMessage());
			System.gc(); // Garbage Collection�� �����Ͽ� �޸𸮸� �ø���.
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		} finally {
			deleteTempFiles(); // ���α׷� ��ġ�� ����� �ӽ����� ����
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) // ��ġ ������ �����ϸ�
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if (!enoughMemory()) // �޸𸮰� �����ϸ�
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles() { }
	static void deleteTempFiles() { }
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}

}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}

//���� �޼��� : ��ġ�� ������ �����մϴ�.
//ch8.SpaceException: ��ġ�� ������ �����մϴ�.
//	at ch8.NewExceptionTest.startInstall(NewExceptionTest.java:24)
//	at ch8.NewExceptionTest.main(NewExceptionTest.java:7)
//������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.