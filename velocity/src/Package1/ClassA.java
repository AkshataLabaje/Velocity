package Package1;

public class ClassA {
	
	public int a = 70;
	
	private int b =90;
	
	public int c =50;
	
	int d =35;
	
	public static void main(String[] args) {
		
		ClassA x = new ClassA();
		
		System.out.println(x.a);  // Calling Variable With Public Access Specifier
		System.out.println(x.b);  // Calling Variable With Private Access Specifier
		System.out.println(x.c); // Calling Variable With Protected Access Specifier
		System.out.println(x.d); // Calling Variable With Default Access Specifier
		}

}
