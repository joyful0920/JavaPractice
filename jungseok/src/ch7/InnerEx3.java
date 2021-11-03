package ch7;

class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; // �ܺ� Ŭ������ private ����� ���� ����
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// ����ƽ Ŭ������ �ܺ� �ν��Ͻ� ����� ���� �Ұ�
	//  int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; // JDK 1.8���� final ���� ����
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			// �ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���� ����
		//	int liv3 = liv; // ����!!! (JDK 1.8���� ���� ����)
			int liv4 = LV; // OK
		}
	}

}