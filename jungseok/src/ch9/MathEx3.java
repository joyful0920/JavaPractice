package ch9;

public class MathEx3 {

	public static void main(String[] args) {
		int x1=1, y1=1;
		int x2=2, y2=2;
		
		double c = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // �� ���� ���� �Ÿ� ���
		double a = c * Math.sin(Math.PI/4); // PI/4 rad = 45 degree 
		double b = c * Math.cos(Math.PI/4);
//		double b = c * Math.cos(toRadians(45)); // ������ �������� ��ȯ
		
		System.out.printf("a=%f%n", a); // a=1.000000
		System.out.printf("b=%f%n", b); // b=1.000000
		System.out.printf("c=%f%n", c); // c=1.414214
		
		// �ﰢ�Լ��� �Ű����� ������ �����̹Ƿ�, 45���� ���� ���� ������ ��ȯ �ʿ�
		// ���� �ﰢ�� �� ���� ���ΰ��� ���ϱ� ���� atan2() ���
		// ��׸��� ��ȯ�ϱ� ���� 180 / PI�� ���ϰų� toDegrees() ���
		System.out.printf("angle=%f rad%n", Math.atan2(a,b)); // angle=0.785398 rad
		System.out.printf("angle=%f degree%n%n", Math.atan2(a,b) * 180 / Math.PI); // angle=45.000000 degree
//		System.out.printf("angle=%f degree%n%n", Math.toDegrees(Math.atan2(a,b)));
		
		// 24�ڸ��� 2������ 10������ ��ȯ�ϱ� ���� ���α׸� �����ϴ� �޼ҵ� ���
		System.out.printf("24 * log10(2)=%f%n", 24 * Math.log10(2)); // 24 * log10(2)=7.224720
		System.out.printf("53 * log10(2)=%f%n%n", 53 * Math.log10(2)); // 53 * log10(2)=15.954590
		
	}

}