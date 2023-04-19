package Exception;

public class Trycatch4 {
	
		public static void main(String[] args) {
		
		int a = 20;
		int b = 0;
		int c = 0;
		int d [] = {12,23,34,45,56,67};
		
		System.out.println("Before Try block code started");
		
		try   {
			
			System.out.println("Try block Risky Code");
			b = 2;
			c = a/b;
			System.out.println(d[3]);     //  event (exception) generated

   }
		catch(ArithmeticException Arithmetic )  {
			b = 2;
			c = a/b;
			System.out.println(Arithmetic);
			System.out.println("Alternative Code of Arithmetic");
			
		}
		
		finally   {
			System.out.println("Finally block executed");
		}
		
	}
}



// In case of finally block

// Exception generated and not get handled
// try block and finally executed

// Exception generated and get handled
// try block and catch block andfinally block and normal flow

// exception not generated
// try block and finally block and normal flow
