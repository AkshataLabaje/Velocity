package Package1;

public class ClassB {
	
	public static void main(String[] args) {
		
		ClassA z = new ClassA();
		
		System.out.println(z.a); // Calling Variable With Public Access Specifier
		//System.out.println(z.b); 
		System.out.println(z.c); // Calling Variable With Protected Access Specifier
		System.out.println(z.d); // Calling Variable With Default Access Specifier
	}

}
