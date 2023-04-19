package Polymorphism;

public class StaticOverloading1 {
	
	public static void addition (int a, int b)   {
		System.out.println(a+b);
		
	}
	
		public static void addition (int a, int b, int c)  {
			
			System.out.println(a+b+c);
			
		}
		
		public static void main(String[] args) {
			
			StaticOverloading1.addition(20, 30);  // Calling with class name due to static method
			StaticOverloading1.addition(20, 40, 50);			
		
		}
	}



