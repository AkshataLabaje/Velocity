package Inheritance;

public class This {   // This Keyword
	
	int a = 75;   // Global Variable
	
	public void Test()  {
		
		int a = 58;       // Local Variable
		
		System.out.println(a);    // Local Variablr 58
		
		System.out.println(this.a);   // 75 Global Vaiable
		
	}
	
		public void Basic()  {
			
			int a =23;   // Local
			
			System.out.println(a);  // Local 23
			
			System.out.println(this.a);  // Global 75
			
		}
		
		public static void main(String[] args) {
			
			This x = new This();
			x.Test();
			x.Basic();
		}
	}
	


