package ch4;

public class FlowEx19 {

	public static void main(String[] args) {

		for (int i=1; i<=3; i++)
			for (int j=i; j<=3; j++)
				for (int k=1; k<=3; k++)
					System.out.println(""+i+j+k);
		
//		111
//		112
//		113
//		121
//		122
//		123
//		131
//		132
//		133
//		221
//		222
//		223
//		231
//		232
//		233
//		331
//		332
//		333
		
	}

}