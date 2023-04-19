package Constructor;

public class LocalGlobal {
	
		int a = 30;       // Global Variable
		public void test()  {
			int b =78;    // Local Variable
			
			System.out.println(b);     // Calling Local Variable
			System.out.println(a);     // Calling Global Variable
			
		}
		
			public void demo()    {
				int c = 90;          // Local Variable 
				
				System.out.println(c);    // Calling Local Variable
				System.out.println(a);     // Calling Global Variable
				
			//	System.out.println(b);     // Local variable from another method cant be call
				
			}
					public static void main(String[] args)   {
						
						LocalGlobal x = new LocalGlobal();
						
						x.test();
						x.demo();
		}
			
}
