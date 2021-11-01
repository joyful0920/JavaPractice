package ch5;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		String[] names = {"Kim", "Yi", "Park"};
		
		for (int i=0; i < names.length; i++)
			System.out.println("names[" + i + "]:" + names[i]);
		
		String tmp = names[2];
		System.out.println("tmp:" + tmp);
		names[0] = "Shin";
		
		for (String str : names)
			System.out.println(str);
				
//		names[0]:Kim
//		names[1]:Yi
//		names[2]:Park
//		tmp:Park
//		Shin
//		Yi
//		Park

	}

}