package ch8;

class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall(); // 프로그램 설치에 필요한 준비
			copyFiles(); // 파일 복사
		} catch (SpaceException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {
			System.out.println("에러 메세지 : " + me.getMessage());
			System.gc(); // Garbage Collection을 수행하여 메모리를 늘린다.
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles(); // 프로그램 설치에 사용한 임시파일 삭제
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) // 설치 공간이 부족하면
			throw new SpaceException("설치할 공간이 부족합니다.");
		if (!enoughMemory()) // 메모리가 부족하면
			throw new MemoryException("메모리가 부족합니다.");
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

//에러 메세지 : 설치할 공간이 부족합니다.
//ch8.SpaceException: 설치할 공간이 부족합니다.
//	at ch8.NewExceptionTest.startInstall(NewExceptionTest.java:24)
//	at ch8.NewExceptionTest.main(NewExceptionTest.java:7)
//공간을 확보한 후에 다시 설치하시기 바랍니다.