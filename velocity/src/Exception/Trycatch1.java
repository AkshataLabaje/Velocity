package Exception;

public class Trycatch1 {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		int c = 0;
		
		try {
			
			System.out.println("Risky Code");
			c = a/b;
		}
		
		catch (ArithmeticException e )   {
			b = 2;
			c = a/b;
			System.out.println("Alternative Code");
			
		}
		
		System.out.println(c);     // Normal Flow
	}

}




// Exception generated and not get handleId
// Try block executed

// Exception generated and get handled
// Try and Catch block and nornal flow

// Exception not generated
// Try and Normal flow