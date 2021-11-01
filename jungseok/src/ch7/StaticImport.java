package ch7;

import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		// System.out.println(Math.random());
		out.println(random()); // 0.3462005122282724
		
		// System.out.println("Math.PI :" + Math.PI);
		out.println("Math.PI :" + PI); // Math.PI :3.141592653589793
	}

}