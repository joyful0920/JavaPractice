package ch8;

public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}	
		if (!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		//	throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
		}
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

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
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

//ch8.InstallException: ��ġ �� ���ܹ߻�
//at ch8.ChainedExceptionEx.install(ChainedExceptionEx.java:20)
//at ch8.ChainedExceptionEx.main(ChainedExceptionEx.java:7)
//Caused by: ch8.SpaceException: ��ġ�� ������ �����մϴ�.
//at ch8.ChainedExceptionEx.startInstall(ChainedExceptionEx.java:34)
//at ch8.ChainedExceptionEx.install(ChainedExceptionEx.java:17)
//... 1 more