package Constructor;

public class Basic3 {    // User Define Constructor With And Without Parameter
	
		int a;
		int b;
		int m;
		String Name;
		String Velocity;
		
		Basic3() {  // User Defined Constructor Without Parameter
			
			a = 78;
			b = 68;
		}
		Basic3 (int c, int d)   {    // User Defined Constructor With Parameter
			
			a=c;
			b=d;
		}
		 Basic3(int c, int d, int i)  {  // User Defined Constructor With Parameter
			 
			 a=c;
			 b=d;
			 m=i;
		 }
		 public void addition()   {  // Non Static Method
			 System.out.println(m+a+b);
		 }
		 
		 public static void main(String[] args) {
			 
			 Basic3 x = new Basic3();
			  x.addition();
			 
			 Basic3 y = new Basic3(50,60);
			  y.addition();
			  
			  Basic3 z = new Basic3(10,20,30);
			  z.addition();
			
		}
					 
		 }
					
		 
		 			



