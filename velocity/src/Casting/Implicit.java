package Casting;

public class Implicit {
	
	public static void main(String[] args) {
		
		byte a = 89;   // Memory Size is 1 byte
		System.out.println(a);
		
		int b = a;  // Memory Size is 4 byte
		System.out.println(b);
		
		double c = b;   // Memory Size is 8 byte
		System.out.println(c);
	}

}
