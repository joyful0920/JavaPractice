package ch7;

//class Tv {
//	boolean power;
//	int channel;
//	
//	void power() { power = !power; }
//	void channelUp() { ++channel; }
//	void channelDown() { --channel; }
//}

class CaptionTv extends Tv {
	boolean caption; // ĸ�� ����(on/off)
	void displayCaption(String text) { 
		if (caption) { // ĸ�� ���°� on(true)�� ���� text ���÷���
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel); // 11
		ctv.displayCaption("Hello, World!");
		ctv.caption = true; // ĸ��(�ڸ�) ��� on 
		ctv.displayCaption("Hello, World!"); // Hello, World!
	}

}