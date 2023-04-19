package ARRAY;

public class SwapBasic {
	
	public static void main(String[] args) {
		
		int a = 75;
		int b =  60;
		
		System.out.println(a);  // 75
		System.out.println(b);  // 60
		
		System.out.println("Integer Swapping");
		
		int c ;       // Declaration of New Variable
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a);     // 60
		System.out.println(b);     // 75
	}

}
