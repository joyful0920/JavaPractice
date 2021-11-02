package ch7;

interface Parseable {
	// ���� �м��۾��� ����
	public abstract void parse(String fileName);
}
class ParserManager {
	// ����Ÿ���� Parseable �������̽�
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ�
		System.out.println(fileName + "-XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		// ���� �м��۾��� �����ϴ� �ڵ�
		System.out.println(fileName + "-HTML parsing completed.");
	}
}

public class ParseTest {

	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml"); // document.xml-XML parsing completed.
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html"); // document2.html-HTML parsing completed.

	}

}