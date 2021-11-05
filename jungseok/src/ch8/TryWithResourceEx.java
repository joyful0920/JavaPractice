package ch8;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false); // ���ܰ� �߻����� ����
		} catch (WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true); // ���� �߻�
		} catch (WorkException e) {
			e.printStackTrace();
		} catch(CloseException e) {
			e.printStackTrace();
		}
	}
}

class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")�� ȣ���");
		
		if (exception)
			throw new WorkException("WorkException �߻�!");
	}
	
	public void close() throws CloseException {
		System.out.println("close()�� ȣ���");
		throw new CloseException("CloseException �߻�!");
	}
}

class WorkException extends Exception {
	WorkException(String msg) { super(msg); }
}

class CloseException extends Exception {
	CloseException(String msg) { super(msg); }
}

//exceptionWork(false)�� ȣ���
//close()�� ȣ���
//ch8.CloseException: CloseException �߻�!
//	at ch8.CloseableResource.close(TryWithResourceEx.java:36)
//
//exceptionWork(true)�� ȣ���
//	at ch8.TryWithResourceEx.main(TryWithResourceEx.java:8)
//close()�� ȣ���
//ch8.WorkException: WorkException �߻�!
//	at ch8.CloseableResource.exceptionWork(TryWithResourceEx.java:31)
//	at ch8.TryWithResourceEx.main(TryWithResourceEx.java:17)
//	Suppressed: ch8.CloseException: CloseException �߻�!
//		at ch8.CloseableResource.close(TryWithResourceEx.java:36)
//		at ch8.TryWithResourceEx.main(TryWithResourceEx.java:18)