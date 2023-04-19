package Inheritance;

public class Super1 extends Super123 {   // int a = 12;
	
	int a = 15;     //   Global Variable
	
	public void Test()  {
		
		int a = 67;   // Local Vaiable
		System.out.println(a);  // Local Variable from Name Class
		
		System.out.println(this.a);  // Global Variable from Name Class
		
		System.out.println(super.a);  // Global Variable from Super Class
		
	}
		public static void main(String[] args) {
			
			Super1 z = new Super1();
			z.Test();
		}
	}


