package ch9;

public class MathEx1 {

	public static void main(String[] args) {
		double val = 90.7552;
		System.out.println("Math.round(" + val + ")=" + Math.round(val)); // �ݿø�
		
		val *= 100;
		System.out.println("Math.round(" + val + ")=" + Math.round(val)); // �ݿø�
		
		System.out.println("Math.round(" + val + ")/100=" + Math.round(val)/100); // �ݿø�
		System.out.println("Math.round(" + val + ")/100.0=" + Math.round(val)/100.0); // �ݿø�
		System.out.println();
		System.out.printf("Math.ceil(%3.1f)=%3.1f%n", 1.1, Math.ceil(1.1)); // �ø�
		System.out.printf("Math.floor(%3.1f)=%3.1f%n", 1.5, Math.floor(1.5)); // ����
		System.out.printf("Math.round(%3.1f)=%d%n", 1.1, Math.round(1.1)); // �ݿø�
		System.out.printf("Math.round(%3.1f)=%d%n", 1.5, Math.round(1.5)); // �ݿø�. ��ȯ���� int
		System.out.printf("Math.rint(%3.1f)=%f%n", 1.5, Math.rint(1.5)); // �ݿø�. ��ȯ���� double
		System.out.printf("Math.round(%3.1f)=%d%n", -1.5, Math.round(-1.5)); // �ݿø�
		System.out.printf("Math.rint(%3.1f)=%f%n", -1.5, Math.rint(-1.5)); // �ݿø�. �� ������ ����� ���� ���� ����� ¦�� ���� ��ȯ
		System.out.printf("Math.ceil(%3.1f)=%f%n", -1.5, Math.ceil(-1.5)); // �ø�
		System.out.printf("Math.floor(%3.1f)=%f%n", -1.5, Math.floor(-1.5)); // ����
		
//		Math.round(90.7552)=91
//		Math.round(9075.52)=9076
//		Math.round(9075.52)/100=90
//		Math.round(9075.52)/100.0=90.76
//
//		Math.ceil(1.1)=2.0
//		Math.floor(1.5)=1.0
//		Math.round(1.1)=1
//		Math.round(1.5)=2
//		Math.rint(1.5)=2.000000
//		Math.round(-1.5)=-1
//		Math.rint(-1.5)=-2.000000
//		Math.ceil(-1.5)=-1.000000
//		Math.floor(-1.5)=-2.000000
	}

}