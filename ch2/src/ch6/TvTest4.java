package ch6;

public class TvTest4 {

	public static void main(String[] args) {
		TV[] tvArr = new TV[3];
		
		for (int i=0; i < tvArr.length; i++) {
			tvArr[i] = new TV();
			tvArr[i].channel = i + 10;
		}
		
		for (int i=0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
			
//			tvArr[0].channel=11
//			tvArr[1].channel=12
//			tvArr[2].channel=13

		}

	}	
}