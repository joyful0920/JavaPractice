package ch6;

class TV {
	// �Ӽ�(����)
	String coclor; // ����
	boolean power; // ���� ����
	int channel; // ä��
	
	// ���(�޼ҵ�)
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

public class TvTest {

	public static void main(String[] args) {
		TV t; // TV �ν��Ͻ��� �����ϱ� ���� t ����
		t = new TV(); // TV �ν��Ͻ� ����
		t.channel = 7; // TV �ν��Ͻ��� ������� channel�� ���� 7�� ����
		t.channelDown(); // TV �ν��Ͻ��� �޼ҵ� channelDown() ȣ��
		System.out.println("���� ä���� " + t.channel + "�Դϴ�."); // ���� ä���� 6�Դϴ�.
	}

}