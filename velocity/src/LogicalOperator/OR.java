package LogicalOperator;

public class OR {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		
		int b = 5;
		
		int c = 40;
		
		System.out.println(a > b || a < c);		// true || true = true
		System.out.println(a > b | a < c); 		// true | ture = true
		// || vs |
		System.out.println(a > b || a ++ < c); 		// true || true = true
		System.out.println(a); 		// 10 Because second condition is not checked
		System.out.println(a > b | a ++ < c); 	// true | true = true
		System.out.println(a); 		// 11 Because second condition is checked
		
		
	}
}
