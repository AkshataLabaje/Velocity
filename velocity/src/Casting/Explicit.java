package Casting;

public class Explicit {
	
	public static void main(String[] args) {
		
		double a = 130;  // Memory Size is 8 byte
		System.out.println(a);
		
		int b = (int) a;  // Memory Size is 4 byte
		System.out.println(b);
		
		byte c =(byte) b;   // Memory Size is 1 byte
		System.out.println(c);
	}

}
