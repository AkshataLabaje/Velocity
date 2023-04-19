package Package2;

import Package1.ClassA;

public class ClassC {
	
	public static void main(String[] args) {
		
		ClassA x = new ClassA();
		
		System.out.println(x.a); // Calling Variable With Public Access Specifier
		
		//System.out.println(x.b);  // Private No Access ( Out Of Scope)
		
		//System.out.println(x.c);  // Protected No Access ( Out Of Scope)
		
		//System.out.println(x.d); // Default Out Of Scope
		
	}
	
	
	}


