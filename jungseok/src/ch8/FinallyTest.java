package ch8;

public class FinallyTest {

	public static void main(String[] args) {
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ�
			copyFiles(); // ���� ����
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����� ����
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����� ����
		}
	}
	
	static void startInstall() {
		// ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ�
	}
	
	static void copyFiles() { /* ������ �����ϴ� �ڵ� */ } 

	static void deleteTempFiles() { /* �ӽ����ϵ��� �����ϴ� �ڵ� */ }
}