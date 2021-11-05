package ch8;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false); // 예외가 발생하지 않음
		} catch (WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true); // 예외 발생
		} catch (WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
	}
}

class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")가 호출됨");
		
		if (exception)
			throw new WorkException("WorkException 발생!");
	}
	
	public void close() throws CloseException {
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException 발생!");
	}
}

class WorkException extends Exception {
	WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
	CloseException(String msg) { super(msg); }
}

//exceptionWork(false)가 호출됨
//close()가 호출됨
//ch8.CloseException: CloseException 발생!
//	at ch8.CloseableResource.close(TryWithResourceEx.java:36)
//
//exceptionWork(true)가 호출됨
//	at ch8.TryWithResourceEx.main(TryWithResourceEx.java:8)
//close()가 호출됨
//ch8.WorkException: WorkException 발생!
//	at ch8.CloseableResource.exceptionWork(TryWithResourceEx.java:31)
//	at ch8.TryWithResourceEx.main(TryWithResourceEx.java:17)
//	Suppressed: ch8.CloseException: CloseException 발생!
//		at ch8.CloseableResource.close(TryWithResourceEx.java:36)
//		at ch8.TryWithResourceEx.main(TryWithResourceEx.java:18)