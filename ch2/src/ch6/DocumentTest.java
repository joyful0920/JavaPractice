package ch6;

class Document {
	static int count = 0;
	String name; // ������
	
	Document() { // ���� ���� �� �������� �������� �ʾ��� ��
		this("�������" + ++count);
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("���� " + this.name + "�� �����Ǿ����ϴ�.");
	}
}

public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document(); // ���� �������1�� �����Ǿ����ϴ�.
		Document d2 = new Document("�ڹ�.txt"); // ���� �ڹ�.txt�� �����Ǿ����ϴ�.
		Document d3 = new Document(); // ���� �������2�� �����Ǿ����ϴ�.
		Document d4 = new Document(); // ���� �������3�� �����Ǿ����ϴ�.
	}

}