package LogicalOperator;

public class AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		
		int b = 5;
		
		int c = 40;
		
		System.out.println(a < b && a++ < c); 	// false && true = false
		System.out.println(a); 	// 10 Because second condition is not checked
		System.out.println(a < b & a ++ < c); 	// false && true = false
		System.out.println(a); 	// 11 Because second condition is checked
		}

}
