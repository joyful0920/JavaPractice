package ch4;

// ������ 3�ܱ��� ���
public class Exercise4_12 {

	public static void main(String[] args) {
//		for (int i=1; i<=3; i++) {
//			for (int j=2; j<=4; j++) {
//				int result = j*i;
//				System.out.print(j + "*" + i + "=" + result + '\t');
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for (int i=1; i<=3; i++) {
//			for (int j=5; j<=7; j++) {
//				int result = j*i;
//				System.out.print(j + "*" + i + "=" + result + '\t');
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for (int i=1; i<=3; i++) {
//			for (int j=8; j<=9; j++) {
//				int result = j*i;
//				System.out.print(j + "*" + i + "=" + result + '\t');
//			}
//			System.out.println();
//		}
		
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=3; j++) {
				int x = j+1 + (i-1)/3*3;
				int y = i%3 == 0 ? 3 : i%3;
				
				if (x > 9)
					break;
				
				System.out.print(x + "*" + y + "=" + x*y + "\t");
			}
			System.out.println();
			if (i%3 == 0)
				System.out.println();
		}
		
//		2*1=2	3*1=3	4*1=4	
//		2*2=4	3*2=6	4*2=8	
//		2*3=6	3*3=9	4*3=12	
//
//		5*1=5	6*1=6	7*1=7	
//		5*2=10	6*2=12	7*2=14	
//		5*3=15	6*3=18	7*3=21	
//
//		8*1=8	9*1=9	
//		8*2=16	9*2=18	
//		8*3=24	9*3=27	

	}

}