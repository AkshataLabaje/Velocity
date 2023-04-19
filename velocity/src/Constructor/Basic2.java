package Constructor;

public class Basic2 {    // User Define Constructor With And Without Parameter
	
	int a;
	int b;
	int m;
	String Name;
	String Velocity;
	
	Basic2 ()   {   // UD Constructor Without Parameter
		
		a = 78;
		b = 68;
		
	}
		Basic2(int c, int d)  //   UD Constructor With Parameter
		{
		a = c;
		b = d;
}
		
		Basic2 (int c, int d, int i) {
		  //  UD Constructor With Parameter
		a = c;
		b = d;
		m = i;

		}
			public void addition()  {     // Non Static Method
				System.out.println(m+a+b);
			}
			
			public static void main(String[] args)  {
				
				Basic2 x = new Basic2();
				
				x.addition();
				x.addition();
				
				Basic2 y = new Basic2(50,60);
				y.addition();
				
				Basic2 z = new Basic2 (10,20,30);
				z.addition();
			}
		}

