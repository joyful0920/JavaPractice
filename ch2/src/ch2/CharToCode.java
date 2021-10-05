package ch2;

public class CharToCode {

	public static void main(String[] args) {
		
		char ch = 'B'; // char ch = 66;
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code); // B=66(0X42)
		
		char hch='°¡'; // char hch = OxAC00;
		
		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch); // °¡=44032(0XAC00)
		
	}

}