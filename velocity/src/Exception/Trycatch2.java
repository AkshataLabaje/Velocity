package Exception;

public class Trycatch2 {
	
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
			System.out.println(d[6]);      //  event (exception) generated
			
		}
		
		catch(ArithmeticException e)  {
			b = 2;
			c = a/b;
			System.out.println("Alternative Code of Arithmetic");
		}
		
		catch(ArrayIndexOutOfBoundsException e)   {
			System.out.println("Alternative code of Array");
			System.out.println(d[3]);
		}
		
		System.out.println(c);    // normal flow
		}

}
