package ch8;

import java.io.File;

public class ExceptionEx14 {

	public static void main(String[] args) {
		// command line���� �Է¹��� ���� �̸����� ���� ���� ����
		File f = createFile(args[0]);
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
	}
	
	
	// ���ܰ� �߻��� �޼ҵ忡�� ���� ���� ó��
	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
		} catch (Exception e) {
			// fileName�� �������� ���, ���� �̸��� '�������.txt'��
			fileName = "�������.txt";
		} finally { // finally�� ���� �߻� ���ο� ������� ���� ���� ����
			File f = new File(fileName); // File Ŭ������ ��ü ����
			createNewFile(f); // ������ ��ü�� �̿��ؼ� ���� ����
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile(); // ���� ����
		} catch (Exception e) { }
	}

}