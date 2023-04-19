package Method;

public class Argument3 {
	
		public void multiplication(int a , int b)  {  // non static method with argumnt
			
			int c =a*b;
			System.out.println("Multiplication = " + c );
			
		}
		
			public static void addtion() {
				int a = 80;
				int b = 90;
				int c = a+b;
				System.out.println(c);
			}
			
			public static void main(String[] args) {
				addtion();
			Argument1 x = new Argument1 ();
			
		    x.Multiplication(70,86);
			x.Multiplication(40,30);
			x.Multiplication(30,21);
		}
}
