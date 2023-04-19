package LogicalPrograms;

public class FibonacciSeries {     // 0 1 1 2 3 5 8 13 21 34
	
	public static void main(String[] args) {
		
		int a = 0;
		
		int b = 1;
		
		int total = 10;
		
		int c ;
		
		System.out.println(a+" "+b);
		
		for (int i = 2; i < total; i++ )   {
			
			c = a+b;    // 0 + 1 = 1
			System.out.println(" "+c);
			
			a = b;   // 1
			b = c;   // 1
		}
	}

}
